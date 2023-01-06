package org.olmedo.patrones.observer.ejemplos;

import org.olmedo.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviar un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardado info del usuario " +
                        u + " en el logs"));
        repo.crearUsuario("Damian");
    }
}
