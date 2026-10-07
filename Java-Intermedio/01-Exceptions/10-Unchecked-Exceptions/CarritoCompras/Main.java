package CarritoCompras;


public class Main{

    public static void main(String[] args){

        Producto producto = new Producto("Zapatillas", 200);

        producto.aplicarDescuento(150);

        System.out.println("El programa continua.");

    }
}