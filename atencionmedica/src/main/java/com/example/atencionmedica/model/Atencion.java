package com.example.atencionmedica.model;

public class Atencion {
    private int atencionid;
    private String atenciondoctor;
    private String atencionresumen;
    private String atencionlugar;

    public Atencion(int atencionid, String atenciondoctor, String atencionresumen, String atencionlugar){
        this.atencionid = atencionid;
        this.atenciondoctor = atenciondoctor;
        this.atencionresumen = atencionresumen;
        this.atencionlugar = atencionlugar;
    }
    
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
}
