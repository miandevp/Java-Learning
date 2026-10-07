package Println;

public class Pago{


    public boolean realizarPago(double monto){
        if(monto > 100){
            System.out.println("ERROR: Fondos insuficientes");
            return false;
        }

        System.out.println("Pago realizado");
        return true;
    }

  

}