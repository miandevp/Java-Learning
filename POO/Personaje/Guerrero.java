package Personaje;

public class Guerrero extends Personaje{

    public Guerrero (String nombre, int edad){
        super(nombre,edad);
    }

    @Override
    public void atacar(){
        System.out.println(nombre + " atacar con una espada");

    }


}

