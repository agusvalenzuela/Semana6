package com.example.atencionmedica.model;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente extends RepresentationModel<Paciente> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pacienteid")
    private int pacienteid;
    @Column(name = "pacienterut")   
    private int pacienterut;
    @Column(name = "pacientenombre")
    private String pacientenombre;
    @Column(name = "pacientecorreo")
    private String pacientecorreo;
    @Column(name = "pacientedireccion")
    private String pacientedireccion;
    @Column(name = "pacienteprevision")
    private String pacienteprevision;
    @Column(name = "pacientegenero")
    private String pacientegenero;
        

    //GETTERS
    public int getPacienteid(){
        return pacienteid;
    }

    public int getPacienterut(){
        return pacienterut;
    }

    public String getPacientenombre(){
        return pacientenombre;
    }

    public String getPacientecorreo(){
        return pacientecorreo;
    }

    public String getPacientedireccion(){
        return pacientedireccion;
    }

    public String getPacienteprevision(){
        return pacienteprevision;
    }

    public String getPacientegenero(){
        return pacientegenero;
    }


    //SETTERS

    public void setPacienteid(Integer pacienteid){
        this.pacienteid = pacienteid;
    }

    public void setPacienterut(Integer pacienterut){
        this.pacienterut = pacienterut;
    }

    public void setPacientenombre(String pacientenombre){
        this.pacientenombre = pacientenombre;
    }

    public void setPacientecorreo(String pacientecorreo){
        this.pacientecorreo = pacientecorreo;
    }

    public void setPacientedireccion(String pacientedireccion){
        this.pacientedireccion = pacientedireccion;
    }

    public void setPacienteprevision(String pacienteprevision){
        this.pacienteprevision = pacienteprevision;
    }

    public void setPacientegenero(String pacientegenero){
        this.pacientegenero = pacientegenero;
    }


}