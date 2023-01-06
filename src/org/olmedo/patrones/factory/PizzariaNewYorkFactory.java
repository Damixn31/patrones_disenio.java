package org.olmedo.patrones.factory;

import org.olmedo.patrones.factory.producto.PizzaNewYorkItaliana;
import org.olmedo.patrones.factory.producto.PizzaNewYorkPeperoni;
import org.olmedo.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzariaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo){
        PizzaProducto producto = switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "peperoni" -> new PizzaNewYorkPeperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
        return producto;
    }
}
