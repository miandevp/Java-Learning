
package Animal;

public class Animal{


    protected String nombre;
    protected int edad;

    protected Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse(){
        System.out.println("Soy" + nombre);
    }

    public final void  respirar(){
        System.out.println(nombre + " esta respirando");
    }


}