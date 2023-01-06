package org.olmedo.patrones.decorator2;

public class Cafe implements Configurable{

    private float precio;
    private String nombre;

    public Cafe(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public Float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
