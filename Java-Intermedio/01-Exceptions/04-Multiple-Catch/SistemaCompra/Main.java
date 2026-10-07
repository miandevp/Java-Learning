package SistemaCompra;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Producto producto = new  Producto("Zapatillas",150,5);

        Tienda tienda = new Tienda(producto);

        try{

            System.out.println("Cuantas zapatilla quieres: ");
            int cantidad = sc.nextInt();

            tienda.realizarCompra(cantidad);
        }catch(Exception e){

            System.out.println("Error inesperado " + e.getMessage()); 

        }

        System.out.println("Programa terminado");


        sc.close();

    }


}