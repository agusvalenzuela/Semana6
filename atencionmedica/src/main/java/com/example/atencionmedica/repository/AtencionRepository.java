package com.example.atencionmedica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atencionmedica.model.Atencion;


public interface AtencionRepository extends JpaRepository<Atencion, Integer>{

    
} 