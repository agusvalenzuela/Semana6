package com.example.tiendaonline.model;


public class Cliente {
    private int clienteid;
    private int clienterut;
    private String clientenombre;
    private String clientecorreo;
    private String clientedireccion;
    private String clienterol;
    private String clientegenero;

    public Cliente(int clienteid, int clienterut, String clientenombre, String clientecorreo, String clientedireccion, String clienterol, String clientegenero){
        this.clienteid = clienteid;
        this.clienterut = clienterut;
        this.clientenombre = clientenombre;
        this.clientecorreo = clientecorreo;
        this.clientedireccion = clientedireccion;
        this.clienterol = clienterol;
        this.clientegenero = clientegenero;
    }

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
    public int setClienteid(Integer clienteid){
        return clienteid;
    }

    public int setClienterut(Integer clienterut){
        return clienterut;
    }

    public String setClientenombre(String clientenombre){
        return clientenombre;
    }

    public String setClientecorreo(String clientecorreo){
        return clientecorreo;
    }

    public String setClientedireccion(String clientedireccion){
        return clientedireccion;
    }

    public String setClienterol(String clienterol){
        return clienterol;
    }

    public String setClientegenero(String clientegenero){
        return clientegenero;
    }


}
