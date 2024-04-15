package com.example.tiendaonline.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteid")
    private int clienteid;
    @Column(name = "clienterut" )
    private int clienterut;
    @Column(name = "clientenombre")
    private String clientenombre;
    @Column(name = "clientecorreo")
    private String clientecorreo;
    @Column(name = "clientedireccion")
    private String clientedireccion;
    @Column(name = "clienterol")
    private String clienterol;
    @Column(name = "clientegenero")
    private String clientegenero;

    //GETTERS
    public int getClienteid(){
        return clienteid;
    }

    public int getClienterut(){
        return clienterut;
    }

    public String getClientenombre(){
        return clientenombre;
    }

    public String getClientecorreo(){
        return clientecorreo;
    }

    public String getClientedireccion(){
        return clientedireccion;
    }

    public String getClienterol(){
        return clienterol;
    }

    public String getClientegenero(){
        return clientegenero;
    }

    //SETTERS
    public void setClienteid(Integer clienteid){
        this.clienteid = clienteid;
    }

    public void setClienterut(Integer clienterut){
        this.clienterut = clienterut;
    }

    public void setClientenombre(String clientenombre){
        this.clientenombre = clientenombre;
    }

    public void setClientecorreo(String clientecorreo){
        this.clientecorreo = clientecorreo;
    }

    public void setClientedireccion(String clientedireccion){
        this.clientedireccion = clientedireccion;
    }

    public void setClienterol(String clienterol){
        this.clienterol = clienterol;
    }

    public void setClientegenero(String clientegenero){
        this.clientegenero = clientegenero;
    }


}
