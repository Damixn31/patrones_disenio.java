package org.olmedo.patrones.decorator;

import org.olmedo.patrones.decorator.decorador.MayusculaDecorador;
import org.olmedo.patrones.decorator.decorador.RemplazarEspacioDecorador;
import org.olmedo.patrones.decorator.decorador.ReversaDecorador;
import org.olmedo.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Damian!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reverse = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reverse);
        RemplazarEspacioDecorador remplazar = new RemplazarEspacioDecorador(subrayado);

        System.out.println(remplazar.darFormato());


    }
}
