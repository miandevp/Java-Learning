package Cuenta;


public class Main{


    public static void main(String[]  args){

        Cuenta cuenta = new Cuenta(100);

        try{
            cuenta.retirar(0);

        }catch(Exception e){

            System.out.println("Ocurrrio un problema");
            System.out.println("Tipo: "+ e.getClass().getSimpleName());
            System.out.println("Mensaje: " + e.getMessage());

        }

        System.out.println("El programacontinua");



    }

}