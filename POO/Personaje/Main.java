package Personaje;


public class Main{


    public static void main(String [] args){

        Personaje p1 = new Guerrero("Michael", 23);
        Personaje p2 = new Mago("Luis", 21);

        p1.mostrarNombre();
        p1.atacar();

        p2.mostrarNombre();
        p2.atacar();
    }

}

