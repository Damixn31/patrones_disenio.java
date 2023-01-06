package org.olmedo.patrones.factory;

import org.olmedo.patrones.factory.producto.PizzaCaliforniaPeperoni;
import org.olmedo.patrones.factory.producto.PizzaCaliforniaQueso;
import org.olmedo.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;

        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "peperoni":
                producto = new PizzaCaliforniaPeperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
