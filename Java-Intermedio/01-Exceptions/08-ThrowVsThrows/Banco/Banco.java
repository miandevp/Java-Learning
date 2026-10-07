package Banco;


public class Banco{

    public void retirar(double saldo, double monto) throws IllegalArgumentException{



        if(monto < saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        System.out.println("Retiro realizado");
    }



}