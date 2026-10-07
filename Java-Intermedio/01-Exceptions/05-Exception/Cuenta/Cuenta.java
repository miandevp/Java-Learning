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

        if(monto < 0){
            throw new IllegalArgumentException("Monto Invalido");
        }

        saldo -= monto;

        System.out.println("Retiro realizado: S/: "+ monto);

    }


}