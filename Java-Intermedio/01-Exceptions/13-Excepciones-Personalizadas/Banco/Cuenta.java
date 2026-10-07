package Banco;

public class Cuenta{
    private double  saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;

    }

    public void retirar(double monto){

        if(monto > saldo){

            throw new SaldoInsuficienteException("No puedes retirar " + monto + " tu saldo es  " + saldo );
        }

        saldo -= monto;

        System.out.println("Retiro saldo realizado");
        System.out.println("Saldo restante: " + saldo);

    }


}