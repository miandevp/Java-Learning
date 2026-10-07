package Dispositivo;

public class Main{

    public static void main(String [] args){

        Dispositivo d1 = new Celular("iphone",false);
        Dispositivo d2 = new Laptop("lenovo",false);

        d1.encender();
        d1.mostrarEstado();

        d2.encender();
        d2.mostrarEstado();

        d1.reiniciar();
        d2.reiniciar();

        d1.apagar();
        d2.apagar();

    }

}