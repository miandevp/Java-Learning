package Propagacion;


public class Main{


    public static void main(String [] args){


        Tienda tienda = new Tienda();

        Cliente cliente = new Cliente(tienda);

        try{
            cliente.realizarCompra();

        }catch(Exception e){
            System.out.println("Main capturo el erro.");
            System.out.println("Tipo: "+ e.getClass().getSimpleName());
            System.out.println("Mensaje: "+ e.getMessage());




        }


        System.out.println("El programa continua");

    }

}