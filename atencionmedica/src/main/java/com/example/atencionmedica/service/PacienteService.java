package com.example.atencionmedica.service;

import java.util.List;
import java.util.Optional;

import com.example.atencionmedica.model.Paciente;

public interface PacienteService {
    List<Paciente> getPacientes();
    Optional<Paciente> getPacienteById(Integer id);    

}

