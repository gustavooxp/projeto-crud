package com.example.projeto.crud.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.crud.DTO.AmbienteDTO;
import com.example.projeto.crud.DTO.ReservaDTO;
import com.example.projeto.crud.Service.AmbienteService;

@RestController
@RequestMapping("/ambientes")   
public class AmbienteController extends BaseController<AmbienteDTO>{

    
        protected AmbienteController(AmbienteService service) {
        super(service);
    }

    @PatchMapping("/recursos/{ambienteId}/{recursoId}")
    public void adicionarRecurso(@PathVariable Long ambienteId, @PathVariable Long recursoId) {
        ((AmbienteService) service).adicionarRecurso(ambienteId, recursoId);
    }

    @GetMapping("/porRecurso/{recursoId}")
    public List<AmbienteDTO> getReservasPorRecursos(@PathVariable("recursoId") Long recursoId) {
        return ((AmbienteService) service).listaPorRecurso(recursoId);
    }
    
}