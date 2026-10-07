package SistemaCompra;


public class Tienda{

    private Producto producto;


    public Tienda(Producto producto){
        this.producto = producto;


    }


    public void realizarCompra(int cantidad){
        producto.comprar(cantidad);
    }

}