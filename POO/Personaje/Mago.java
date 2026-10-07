
package Personaje;

public class Mago extends Personaje{

    public Mago(String nombre, int edad){
        super(nombre ,edad);
    }

    @Override
    public void atacar(){
        System.out.println(nombre + " lanzar un hechizo");
    }

    

}
