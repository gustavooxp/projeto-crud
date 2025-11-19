package com.example.projeto.crud.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projeto.crud.DTO.AmbienteDTO;
import com.example.projeto.crud.DTO.ReservaDTO;
import com.example.projeto.crud.Entity.Ambiente;
import com.example.projeto.crud.Entity.Reserva;
import com.example.projeto.crud.Repository.AmbienteRepository;
import com.example.projeto.crud.Repository.ReservaRepository;

import jakarta.transaction.Transactional;

@Service
public class AmbienteService extends BaseService<Ambiente, AmbienteDTO> {

    private AmbienteRepository repository;

    protected AmbienteService(AmbienteRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public void delete(Long id) {
        boolean reservado = repository.temReserva(id);

        if (reservado) {
            throw new IllegalStateException("Ambiente possui reservas futuras e ambiente não pode ser excluído.");
        }
        super.delete(id);
    }

    @Transactional
    public void adicionarRecurso(Long ambienteId, Long recursoId) {
        Ambiente ambiente = repository.findById(ambienteId)
                .orElseThrow(() -> new IllegalArgumentException("Ambiente não encontrado com id: " + ambienteId));

        ambiente.getRecursos().add(new com.example.projeto.crud.Entity.Recursos(recursoId, null, null));

        repository.save(ambiente);
    }

    // listar ambientes por recurso
    public List<AmbienteDTO> listaPorRecurso(Long recursoId) {
        List<Ambiente> ambientes = repository.findByRecursoId(recursoId);

        List<AmbienteDTO> dtos = new ArrayList<>();

        for (Ambiente ambiente : ambientes) {
            dtos.add(super.toDto(ambiente));
        }
        return dtos;
    } 

    
    
}
