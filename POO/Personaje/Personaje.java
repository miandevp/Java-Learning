

package Personaje;

public abstract class Personaje{

    protected String nombre;
    protected int edad;

    public Personaje(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarNombre(){
        System.out.println("Personaje " + nombre );
    }

    public abstract void atacar();

}