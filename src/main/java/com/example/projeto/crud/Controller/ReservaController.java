package com.example.projeto.crud.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.crud.DTO.ReservaDTO;
import com.example.projeto.crud.Service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController extends BaseController<ReservaDTO>{
 
    protected ReservaController(ReservaService service) {
        super(service);
    }
    
}
