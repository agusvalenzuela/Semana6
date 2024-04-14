package com.example.atencionmedica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atencion")
public class Atencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atencionid")
    private int atencionid;
    @Column(name = "atenciondoctor")
    private String atenciondoctor;
    @Column(name = "atencionresumen")
    private String atencionresumen;
    @Column(name = "atencionlugar")
    private String atencionlugar;
   
    //Getters
    public int getAtencionid(){
        return atencionid;
    }

    public String getAtenciondoctor(){
        return atenciondoctor;
    }

    public String getAtencionresumen(){
        return atencionresumen;
    }

    public String getAtencionlugar(){
        return atencionlugar;
    }

    //Setters
    public void setAtencionid(Integer atencionid){
        this.atencionid = atencionid;
    }

    public void setAtenciondoctor(String atenciondoctor){
        this.atenciondoctor = atenciondoctor;
    }

    public void setAtencionresumen(String atencionresumen){
        this.atencionresumen = atencionresumen;
    }

    public void setAtencionlugar(String atencionlugar){
        this.atencionlugar = atencionlugar;
    }
}
