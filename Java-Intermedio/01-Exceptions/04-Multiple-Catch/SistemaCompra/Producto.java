package SistemaCompra;

public class Producto{


    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void comprar(int cantidad){
        if(cantidad > stock ){

            throw new IllegalArgumentException("No hay suficiente stock");
        }

        if(cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }

        stock -= cantidad;


        System.out.println("Compra realizada");
        System.out.println("Producto: "+ nombre);
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Total: " + (precio*cantidad));

    }


}