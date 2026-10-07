package TransferenciaBancaria;


public class Main{

    public static void main(String[] args){

        Banco banco = new Banco();

        try{
            banco.transferir(100,150);

        }catch(IllegalArgumentException e){

            System.out.println("Error: "+e.getMessage() );
        }

        System.out.println("El programa continua..");
    }


}