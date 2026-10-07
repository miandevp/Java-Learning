
package Empresa1;

public class Programador extends Empleado{

    public Programador(String nombre, int edad){
        super(nombre, edad);
    }


    @Override
    public void trabajar(){
        System.out.println(nombre + " esta trabajando");
    }

    public void programar(){
        System.out.println(nombre + " esta escribiendo codigo");
    }
}