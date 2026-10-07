package CarritoCompras;

public class Producto{

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje){

        if(porcentaje < 0 || porcentaje > 100){
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100");

        }

        double descuento = precio * porcentaje/100;

        precio -= descuento;

        System.out.println("Nuevo precio: "+ precio);

    }


}