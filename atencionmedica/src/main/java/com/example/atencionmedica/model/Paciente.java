package com.example.atencionmedica.model;

import java.util.List;

public class Paciente {
    private int pacienteid;
    private int pacienterut;
    private String pacientenombre;
    private String pacientecorreo;
    private String pacientedireccion;
    private String pacienteprevision;
    private String pacientegenero;
    private List<Atencion> atenciones;
    

    public Paciente(int pacienteid, int pacienterut, String pacientenombre, String pacientecorreo, String pacientedireccion, String pacienteprevision, String pacientegenero, List<Atencion> atenciones){
        this.pacienteid = pacienteid;
        this.pacienterut = pacienterut;
        this.pacientenombre = pacientenombre;
        this.pacientecorreo = pacientecorreo;
        this.pacientedireccion = pacientedireccion;
        this.pacienteprevision = pacienteprevision;
        this.pacientegenero = pacientegenero;
        this.atenciones = atenciones;
    }

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

    public List<Atencion> getAtenciones(){
        return atenciones;
    }
}