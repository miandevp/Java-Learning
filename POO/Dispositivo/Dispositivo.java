package Dispositivo;

public interface Dispositivo{

    void encender();

    void apagar();

    void mostrarEstado();


    default void reiniciar(){
        System.out.println("Reiniciando dispositivo");
    }


}



