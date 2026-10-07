package Empresa1;


public class Diseñador extends Empleado{

    public Diseñador(String nombre, int edad){
        super(nombre,edad);


    }


    @Override
    public void trabajar(){
        System.out.println(nombre + " esta diseñando");
    }

    public void usarPhotoshop(){
        System.out.println(nombre + " esta usando Photoshop");

    }


}