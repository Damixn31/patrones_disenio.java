package org.olmedo.patrones.decorator2.decorador;

import org.olmedo.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{
    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public Float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
