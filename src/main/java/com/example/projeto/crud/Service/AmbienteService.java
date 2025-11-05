package com.example.projeto.crud.Service;

import org.springframework.stereotype.Service;

import com.example.projeto.crud.DTO.AmbienteDTO;
import com.example.projeto.crud.Entity.Ambiente;
import com.example.projeto.crud.Repository.AmbienteRepository;

@Service
public class AmbienteService extends BaseService<Ambiente, AmbienteDTO> {

    private AmbienteRepository repository;

    protected AmbienteService(AmbienteRepository repository) {
        super(repository);
        this.repository = repository;
    }

}
