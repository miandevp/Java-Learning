


public class Producto{

        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre,double precio ,int stock){
            this.nombre = nombre;
            this.precio = precio;
            this.stock  = stock;
        }

        public Producto(String nombre,double precio){
            this.nombre = nombre;
            this.precio =precio;
            this.stock = 0;
        }

        public void vender(int cantidad){
            if(cantidad > 0 && cantidad <= stock){
                stock -= cantidad;
                System.out.println("productos vendidos");
            }
        }

        public void mostrar(){
            System.out.println("Nombre " + nombre);
            System.out.println("Precio " + precio);
            System.out.println("Stock " + stock);

        }





}