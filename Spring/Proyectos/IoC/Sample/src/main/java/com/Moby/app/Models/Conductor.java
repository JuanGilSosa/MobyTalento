package com.Moby.app.Models;

public class Conductor {

    Vehiculo vehiculoConductor;

    public void setVehiculoConductor(Vehiculo vehiculoConductor){
        this.vehiculoConductor = vehiculoConductor;
    }

    public String conducir(){
        return String.format("Estoy conduciendo un %s", vehiculoConductor.andar());
    }

}
