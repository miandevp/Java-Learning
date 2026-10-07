package Cuenta;

import java.util.Scanner;


public class Main{


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        Cuenta cuenta = new Cuenta(100);

        System.out.println("Cuanto desea retirar: ");
        double monto = sc.nextDouble();

        try{
            cuenta.retirar(monto);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("El programa continua... ");


    }




}