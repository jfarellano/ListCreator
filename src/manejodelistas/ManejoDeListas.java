package manejodelistas;

import Manejo.Ejemplo;
import Manejo.Lista;
import Manejo.Nodo;

public class ManejoDeListas {

    public static void main(String[] args) {
        Lista l = new Lista();
        for(int i = 0; i < 5; i++){
            Nodo n = new Nodo(i);
            l.add(n);
        }
        System.out.println(l.length());
        Nodo p = null;
        for(int i = 0; i < 5; i++){
            Nodo j = l.getCourrent();
            System.out.println("El id del nodo es: " + j.getId());
            if(j.getId() == 3){
                p = j;
            }
            l.next();
        }
        
        l.remove(p);
        System.out.println("Hola");
        
        System.out.println(l.length());
        
        for(int i = 0; i < 5; i++){
            Nodo j = l.getCourrent();
            System.out.println("El id del nodo es: " + j.getId());
            l.next();
        }
        
        Lista personas = new Lista();
        
        Ejemplo e = new Ejemplo("Juan", "Arellano", 19);
        personas.add(e);
        Ejemplo e2 = new Ejemplo("John", "Barbosa", 18);
        personas.add(e2);
        
        Ejemplo ej = null;
        for(int i = 0; i < personas.length(); i++){
            ej = (Ejemplo) personas.getCourrent();
            System.out.println("Nombre: " + ej.nombre + " Apellido: " + ej.apellido + " Edad: " + ej.edad);
            personas.next();
        }
    }

}
