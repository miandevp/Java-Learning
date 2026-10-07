package Dispositivo;


public class Celular implements Dispositivo{

    private String modelo;
    private boolean encendido;


    public Celular(String modelo, boolean encendido){
        this.modelo = modelo;
        this.encendido = encendido;
    }

    @Override
    public void encender(){
        encendido = true;
        System.out.println(modelo + " se esta encendiendo");
    }


    @Override
    public void apagar(){
        encendido = false;
        System.out.println(modelo + " se apagó");
    }
    
    @Override
    public void mostrarEstado(){
        System.out.println(modelo + " esta" + (encendido ? "encendido": "apagado" ));
    }

    public void tomarPhoto(){
        System.out.println(modelo + " esta tomando una foto");
    }


}