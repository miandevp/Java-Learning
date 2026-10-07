package Banco;



public class Main{

    public static void main(String[] args){

        Cuenta cuenta = new Cuenta(100);

        try{

            cuenta.retirar(150);

        }catch(SaldoInsuficienteException e){

            System.out.println("error bancario "+ e.getMessage());
        }

        System.out.println("El programa continua");
    }


}