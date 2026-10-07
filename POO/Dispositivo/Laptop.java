package Dispositivo;

public class Laptop implements Dispositivo{

    private String modelo;
    private boolean encendido;

    public Laptop(String modelo, boolean encendido){
        this.modelo = modelo;
        this.encendido = encendido;

    }

    @Override
    public void encender(){
        encendido =true;
        System.out.println(modelo + " se esta encendiendo");
    }
    
    @Override
    public void apagar(){
        encendido = false;
        System.out.println(modelo + " se esta apagando");
    }
    
    @Override
    public void mostrarEstado(){
        System.out.println(modelo + " esta " + (encendido ? "encendido" : "apagado"));
    }

    public void programar(){
        System.out.println(modelo + "esta ejecutando codigo");
    }
    

}