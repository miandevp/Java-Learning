
package Empresa1;

public class Empleado{

    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public void trabajar(){
        System.out.println(nombre + "  esta trabajando ");
    }

}