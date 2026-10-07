package CajeroAutomatico;


public class Main{

    public static void main(String [] args){
        Cuenta cuenta = new Cuenta(100);

        Cajero cajero = new Cajero(cuenta);

        cajero.retirar(50);

        System.out.println();

        cajero.retirar(200);



    }

}