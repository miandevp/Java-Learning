package SistemaUsuario;

import java.util.Scanner;

public class Main{

    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);

        System.out.println("1.- Registrar usuario." );
        System.out.println("2.- Calcular Division." );
        System.out.println("3.- Buscar usuario." );
        System.out.println("4.- Mostrar nombre." );
        System.out.println("5.- Salir." );

        System.out.print("Elije una opcion:  " );

        int opcion = sc.nextInt();

        try{
            switch(opcion){
                case 1:
                    System.out.print("Ingresa tu edad: ");
                    String textoEdad = sc.next();

                    int edad = Integer.parseInt(textoEdad);

                    System.out.println("Edad registrada" + edad);

                    break;


                case 2:

                    System.out.print("Ingresar el primer numero: ");

                    int a  = sc.nextInt();

                    System.out.print("Ingrese el segundo numero: ");

                    int b = sc.nextInt();

                    int resultado = a/b;

                    System.out.println("Resultado " + resultado);

                    break;

                case 3:

                    String [] usuarios = {"Michael", "Ana","Carlos"};

                    System.out.println("Ingrese una posicion: ");

                    int posicion = sc.nextInt();

                    System.out.println("Usuario: "+ usuarios[posicion]);

                    break;

                case 4:

                    String nombre = null;

                    System.out.println("Longitud del nombre: "+ nombre.length());
                    break;
                
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opcion Invalida");

            }


        }catch(Exception e){
            System.out.println();
            System.out.println("Ocurio un problema");
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Mesaje: "+ e.getMessage());


        }finally{   

                System.out.println();
                System.out.println("Fin del programa");


        }


        sc.close();


    }

}