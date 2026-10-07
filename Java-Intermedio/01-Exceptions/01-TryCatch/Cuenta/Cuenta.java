
package Cuenta;
public class Cuenta{

    private double saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;
    }


    public void retirar(double monto){
        if(monto > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -=  monto;
        System.out.println("Retiro realizado: "+ monto);
        System.out.println("Saldo restante: "+ saldo);

    }


}