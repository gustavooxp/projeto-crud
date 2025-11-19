package com.example.projeto.crud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.crud.DTO.RecursosDTO;
import com.example.projeto.crud.Service.RecursosService;

@RestController
@RequestMapping("/recursos")
public class RecursosController extends BaseController<RecursosDTO> {

    protected RecursosController(RecursosService service) {
        super(service);
    }

}
