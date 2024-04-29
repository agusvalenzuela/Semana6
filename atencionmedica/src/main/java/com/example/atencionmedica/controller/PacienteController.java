package com.example.atencionmedica.controller;

import com.example.atencionmedica.model.Paciente;
import com.example.atencionmedica.service.PacienteService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
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

    @GetMapping
    public CollectionModel<EntityModel<Paciente>> getPacientes(){
        List<Paciente> pacientes = pacienteService.getPacientes();

        List<EntityModel<Paciente>> pacienteResources = pacientes.stream()
            .map(paciente -> EntityModel.of(paciente,
                    WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacienteById(paciente.getPacienteid())).withSelfRel()))
            .collect(Collectors.toList());
        
        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacientes());
        CollectionModel<EntityModel<Paciente>> resources = CollectionModel.of(pacienteResources, linkTo.withRel("pacientes"));

        return resources;
    }
    
    @GetMapping("/{pacienteid}")
    public EntityModel<Paciente> getPacienteById(@PathVariable Integer pacienteid) {
        Optional<Paciente> paciente = pacienteService.getPacienteById(pacienteid);
        
        //Verifica si el paciente existe
		if(paciente.isPresent()) {
			return EntityModel.of(paciente.get(),
				WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacienteById(pacienteid)).withSelfRel(),
				WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacientes()).withRel("all-pacientes"));	
		} else {
			throw new PacienteNotFoundException("Paciente not found with id: " + pacienteid);
		}

    }

    @PostMapping
    public EntityModel<Paciente> createPaciente(@RequestBody Paciente paciente){
        Paciente createdPaciente = pacienteService.createPaciente(paciente);
        return EntityModel.of(createdPaciente,
							WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacienteById(createdPaciente.getPacienteid())).withSelfRel(),
							WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacientes()).withRel("all-pacientes")
						);
    }

    @PutMapping("/{pacienteid}")
    public EntityModel<Paciente> updatePaciente(@PathVariable int pacienteid, @RequestBody Paciente paciente) {
        Paciente updatedPaciente = pacienteService.updatePaciente(pacienteid, paciente);
       return EntityModel.of(updatedPaciente,
           WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacienteById(pacienteid)).withSelfRel(),
           WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getPacientes()).withRel("all-pacientes")
       );
   }
    
    @DeleteMapping("/{pacienteid}") 
    public void deletePaciente(@PathVariable Integer pacienteid) {
        pacienteService.deletePaciente(pacienteid);
    }
    
}
