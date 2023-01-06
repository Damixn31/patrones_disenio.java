package org.olmedo.patrones.factory.ejemplo;

import org.olmedo.patrones.factory.PizzaProducto;
import org.olmedo.patrones.factory.PizzariaNewYorkFactory;
import org.olmedo.patrones.factory.PizzeriaCaliforniaFactory;
import org.olmedo.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzariaNewYorkFactory(); // siempre usar el tipo mas generico como PizzeriaAbastactFactory
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("peperoni");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena una pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("peperoni");
        System.out.println("John orde una pizza " + pizza.getNombre());


        System.out.println("pizza = " + pizza);
    }
}
