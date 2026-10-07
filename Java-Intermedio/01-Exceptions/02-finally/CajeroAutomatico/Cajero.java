package CajeroAutomatico;

public class Cajero{
    private Cuenta cuenta;

    public Cajero(Cuenta cuenta){
        this.cuenta = cuenta;

    }

    public void retirar(double monto){
        System.out.println("Conectando con la cuenta");

        try {
            cuenta.retirar(monto);
        }catch(IllegalArgumentException e){

            System.out.println("Error" + e.getMessage());

        }finally{
            System.out.println("Cerrando sesion del cajero");
        }
    }


}