package RegistroUsuario;

public class Usuario{


    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad){
        if(edad < 18){
            throw new IllegalArgumentException("El  usuario debe ser mayor de edad");
        }

        this.nombre = nombre;
        this.edad = edad;

    }

    public void MostrarDatos(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);

    }


}