package Manejo;

public class Nodo {
    
    protected int id;
    protected Nodo linkR, linkL;
    protected String nombre;
    
    //El uso de nombre es para identificar el tipo de clase en caso de tener una lista con multiples clases
    
    public Nodo(int id) {
        this.id = id;
    }

    public Nodo() {
    }
    
    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}