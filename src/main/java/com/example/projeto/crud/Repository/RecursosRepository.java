package com.example.projeto.crud.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.projeto.crud.Entity.Recursos;

@Repository
public interface RecursosRepository extends BaseRepository<Recursos, Long>{



}
