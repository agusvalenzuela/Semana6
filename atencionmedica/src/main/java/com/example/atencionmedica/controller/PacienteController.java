package com.example.atencionmedica.controller;

// import com.example.atencionmedica.model.Atencion;
import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.service.PacienteService;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/pacientes") 
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;    

    @GetMapping()
    public List<Paciente> getPacientes(){
        return pacienteService.getPacientes();
    }
    
    @GetMapping("/{pacienteid}")
    public Optional<Paciente> getPacienteById(@PathVariable Integer pacienteid) {
        return pacienteService.getPacienteById(pacienteid);
    }
         
}
