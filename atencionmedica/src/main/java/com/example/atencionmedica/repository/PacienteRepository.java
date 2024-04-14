package com.example.atencionmedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atencionmedica.model.Paciente;


public interface PacienteRepository extends JpaRepository<Paciente, Integer>{

    
} 
