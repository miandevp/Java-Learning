package Propagacion;


public class Cliente{
    private Tienda tienda;

    public Cliente(Tienda tienda){
        this.tienda = tienda;

    }

    public void realizarCompra(){

        System.out.println("Cliente: voy a comprar");
        tienda.comprar();

        System.out.println("Cliente: compra temrinada"); 


    }


}