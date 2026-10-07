package RegistroUsuario;

public class Main{

    public static void main(String [] args){

        try{
            Usuario usuario = new Usuario("Michael",15);

            usuario.MostrarDatos();



        }catch(IllegalArgumentException e){

            System.out.println("No se pudo crear el usuario");

            System.out.println("Motivo" + e.getMessage());

        }


        System.out.println("El programa continua..");

    }


}
