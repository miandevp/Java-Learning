package Println;

public class Tienda{


    private Pedido pedido = new Pedido();

    public void comprar(double monto){

        System.out.println("Iniciando comprar");

        boolean resultado = pedido.procesarPedido(monto);

        if(!resultado){
            System.out.println("La compra fue cancelada");
        }
    }


}