

public class CuentaBancaria{

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo   = saldoInicial;
    }

    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("deposito hecho");
        }
    }

    public boolean retirar(double cantidad){
        if(cantidad > 0  &&  cantidad <= saldo){
            saldo -= cantidad;
            return true;
        }

        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String newTitular){
        this.titular = newTitular;
    }

    public void mostrarInformacion(){
        System.out.println("Titular" + titular);
        System.out.println("Saldo" + saldo);
    }


}