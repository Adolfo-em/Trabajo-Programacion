package Teoria2;

public class Persona {
    private int edad;
    private String nombre;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString(){
        return nombre + "-" + edad;
    }
}
