package com.Moby.app.Models;

public class Camion implements Vehiculo{
    @Override
    public String andar(){
        return "Camion cargado con combustible";
    }
}
