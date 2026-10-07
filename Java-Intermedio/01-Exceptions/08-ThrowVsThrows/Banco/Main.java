package Banco;


public class Main{

    public static void main(String[] args){

        Banco banco = new Banco();

        try{

            banco.retirar(100,50);

        }catch (IllegalArgumentException e){

            System.out.println("Error" + e.getMessage());
        }
    }


}