package com.example.projeto.crud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.crud.DTO.AmbienteDTO;
import com.example.projeto.crud.Service.AmbienteService;

@RestController
@RequestMapping("/ambientes")
public class AmbienteController extends BaseController<AmbienteDTO>{

    protected AmbienteController(AmbienteService service) {
        super(service);
    }

}
