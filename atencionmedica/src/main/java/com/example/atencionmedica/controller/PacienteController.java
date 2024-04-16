package com.example.atencionmedica.controller;

// import com.example.atencionmedica.model.Atencion;
import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.service.PacienteService;

import java.util.List;
import java.util.Optional;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/pacientes") 
public class PacienteController {

    private static final Logger log = LoggerFactory.getLogger(PacienteController.class);

    @Autowired
    private PacienteService pacienteService;    

    @GetMapping()
    public List<Paciente> getPacientes(){
        log.info("GET /pacientes");
        log.info("Retornando todos los estudiantes");
        return pacienteService.getPacientes();
    }
    
    @GetMapping("/{pacienteid}")
    public ResponseEntity <Optional<Paciente>> getPacienteById(@PathVariable Integer pacienteid) {
        Optional<Paciente> paciente = pacienteService.getPacienteById(pacienteid);
        if(paciente.isEmpty()){
            log.error("No se encontró el estudiante con ID {}", pacienteid);
            return ResponseEntity.notFound().build();
        }
        log.info("Estudiante encontrado con éxito");
        return ResponseEntity.ok(pacienteService.getPacienteById(pacienteid));
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
