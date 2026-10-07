package TransferenciaBancaria;


public class Banco{

    public void transferir(double saldo,double monto) throws IllegalArgumentException{

        if(monto >  saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        System.out.println("Transferencia realizada");
        

    }
}