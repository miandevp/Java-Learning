package TryWithResources;


public class Main{


    public static void main(String[] args){
        Lector lector = new Lector();

        try{
            lector.leer();

        }catch(Exception e ){
            System.out.println("Error: " + e.getMessage() );
        }

        System.out.println("Programa terminado..");



    }


}