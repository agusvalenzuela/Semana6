package com.example.atencionmedica.controller;

import com.example.atencionmedica.model.Atencion;
import com.example.atencionmedica.model.Paciente;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PacienteController {
    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteController(){
        pacientes.add(new Paciente(1, 108728038, "Marisol Sanhueza Muñoz", "msanhueza@gmail.com", "Alameda 234, Est. Central", "Fonasa", "F",
                      Arrays.asList(new Atencion(1, "Dr. Jara", "Se observa rush alergico", "CM Sta Lucia"))));
        pacientes.add(new Paciente(2, 278456897, "María Campos Donoso", "mcampos@gmail.com", "Albuquerque 2350, Est. Central", "Isapre", "F",
                      Arrays.asList(new Atencion(2, "Dr. Salas", "Paciente indica ardor en las encías", "CM San Jorge"))));
        pacientes.add(new Paciente(3, 178549857, "Hector Barros Acevedo", "hbarros@gmail.com", "Dieciocho 244, Est. Central", "Fonasa", "M",
                      Arrays.asList(new Atencion(3, "Dr. Zúñiga", "Paciente trae examenes para revision", "CM Marcoleta"))));
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPaciente(){
        return pacientes;
    }

    @GetMapping("/pacientes/{pacienteid}")
    public Paciente getPacienteById(@PathVariable int pacienteid) {
        for (Paciente paciente: pacientes){
            if (paciente.getPacienteid() == pacienteid){
                return paciente;
            }
        }
        return null;
    }
         
}