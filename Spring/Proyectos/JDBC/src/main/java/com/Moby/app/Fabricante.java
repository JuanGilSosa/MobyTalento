package com.Moby.app;

public class Fabricante {
    
    private String codigo;
    private String nombre;

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString(){
        return "Fabricante : nombre=" + nombre + "codigo=" + codigo; 
    }
}
