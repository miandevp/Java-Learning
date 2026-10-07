
public class Main{


    public static void main(String [] args){

        Producto p1 = new Producto("Arroz1", 30, 20);
        Producto p2 = new Producto("Arroz2", 30);


        p1.vender(2);

        p1.mostrar();
        p2.mostrar();

        Producto p3 = p1;

        p3.vender(3);
        p3.mostrar();

    }

}