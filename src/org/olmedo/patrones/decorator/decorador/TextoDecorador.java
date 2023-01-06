package org.olmedo.patrones.decorator.decorador;

import org.olmedo.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto; // protected para que sea visible en la clase hija

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
