package com.Moby.app;

public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
    private String codigoFabricante;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getCodigoFabricante() {
        return codigoFabricante;
    }
    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", codigoFabricante=" + codigoFabricante + ", nombre=" + nombre
                + ", precio=" + precio + "]";
    }
}
