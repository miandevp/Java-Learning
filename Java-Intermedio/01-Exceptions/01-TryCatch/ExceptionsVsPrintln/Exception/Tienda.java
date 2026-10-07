
package Exception;

public class Tienda {

    private Pedido pedido = new Pedido();

    public void comprar(double monto) {

        System.out.println("Iniciando compra...");

        try {

            pedido.procesarPedido(monto);

            System.out.println("Compra exitosa");

        } catch (IllegalArgumentException e) {

            System.out.println("La tienda detectó un problema:");
            System.out.println(e.getMessage());

        }
    }
}