package com.example.projeto.crud.Service;

import org.springframework.stereotype.Service;

import com.example.projeto.crud.DTO.ReservaDTO;
import com.example.projeto.crud.Entity.Reserva;
import com.example.projeto.crud.Repository.ReservaRepository;

@Service
public class ReservaService extends BaseService<Reserva, ReservaDTO> {
    
    private ReservaRepository repository;

    protected ReservaService(ReservaRepository repository) {
        super(repository);
        this.repository = repository;
    }

}
