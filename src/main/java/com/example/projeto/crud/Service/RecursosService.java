package com.example.projeto.crud.Service;

import org.springframework.stereotype.Service;

import com.example.projeto.crud.DTO.RecursosDTO;
import com.example.projeto.crud.Entity.Recursos;
import com.example.projeto.crud.Repository.RecursosRepository;

@Service
public class RecursosService extends BaseService<Recursos, RecursosDTO> {

    private RecursosRepository repository;

    protected RecursosService(RecursosRepository repository) {
        super(repository);
        this.repository = repository;
    }

  }
