package com.example.atencionmedica.controller;

// import com.example.atencionmedica.model.Atencion;
import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.service.PacienteService;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


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

    @PostMapping
    public Paciente createPaciente(@RequestBody Paciente paciente){
        return pacienteService.createPaciente(paciente);
    }

    @PutMapping("/{pacienteid}")
    public Paciente updatePaciente(@PathVariable Integer pacienteid, @RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(pacienteid, paciente);
    }
    
    @DeleteMapping("/{pacienteid}") 
    public void deletePaciente(@PathVariable Integer pacienteid){
        pacienteService.deletePaciente(pacienteid);
    }
    
}
