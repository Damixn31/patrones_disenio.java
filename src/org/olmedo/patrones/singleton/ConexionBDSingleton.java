package org.olmedo.patrones.singleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectando algun motor de base de datos!");
    }

    public static ConexionBDSingleton getInstancia() {
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }


}
