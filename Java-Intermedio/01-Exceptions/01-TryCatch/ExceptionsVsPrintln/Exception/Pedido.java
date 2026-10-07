package Exception;


public class Pedido {

    private Pago pago = new Pago();

    public void procesarPedido(double monto) {

        System.out.println("Procesando pedido...");

        pago.realizarPago(monto);
    }
}