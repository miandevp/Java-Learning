

public class CuentaBancaria1{


    private String titular;
    private double saldo;



    public CuentaBancaria1(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }


    public void depositar(double newSaldo){
        if(newSaldo > 0 ){
            this.saldo += newSaldo;
            System.out.println("deposito hecho");
        }

    }

    public void retiro(double cantidad){
        if(saldo > 0 && saldo >= cantidad){
            this.saldo -= cantidad;
            System.out.println("retiro hecho");
        }
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String newTitular){
        this.titular = newTitular;
    }

    public void print(){
        System.out.println("Titular " + titular);
        System.out.println("Saldo " + saldo);
    }


}