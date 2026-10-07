package Println;

public class Pedido{
    private Pago pago = new Pago();

    public boolean procesarPedido(double monto){

        System.out.println("Procesar pedido...");

        return pago.realizarPago(monto);
    }

}