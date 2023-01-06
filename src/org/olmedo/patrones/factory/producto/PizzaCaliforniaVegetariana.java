package org.olmedo.patrones.factory.producto;

import org.olmedo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana(){
        super();
        nombre = "Pizza California Vegetariana";
        masa = " Masa delgada Light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozzarela");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berengenas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinar por 20 min. a 180 C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
