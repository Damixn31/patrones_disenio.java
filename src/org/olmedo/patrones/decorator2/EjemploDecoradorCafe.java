package org.olmedo.patrones.decorator2;

import org.olmedo.patrones.decorator2.decorador.ConChocolateDecorador;
import org.olmedo.patrones.decorator2.decorador.ConCremaDecorador;
import org.olmedo.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuccino = new Cafe("Cafe Capuccino", 4);
        conCrema = new ConCremaDecorador(capuccino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capucciono es : " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable expresso = new Cafe("Cafe Expresso", 3);
        System.out.println("El precio del cafe expreso es: " + expresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe Expreso es: " + expresso.getIngredientes());
    }
}
