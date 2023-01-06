package org.olmedo.patrones.factory.producto;

import org.olmedo.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni(){
        super();
        nombre = "Pizza California Peperoni";
        masa = "Masa a la piedra gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add("Peperoni");
        ingredientes.add("Extra queso mozzarrela");
        ingredientes.add("Aceitunas");
    }
    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55 C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequenios rectangulos");
    }
}
