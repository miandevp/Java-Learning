package CheckedExceptions;


import java.io.IOException;

public class Main{



    public static void main(String[] args){
        Lector lector = new Lector();

        try{
            lector.leer();

        }catch(Exception e){
            System.out.println("No se pudo lee el archivo.");
            System.out.println("Motivo: " + e.getMessage());
        }

        System.out.println("Sistema continua...");


    }


}