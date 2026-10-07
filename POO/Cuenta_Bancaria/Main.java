public class Main{
    public static void main(String [] args){
        CuentaBancaria1 cuenta = new CuentaBancaria1("Michael",1000);

        cuenta.print();

        cuenta.depositar(100);
        cuenta.print();

        cuenta.retiro(500);
        cuenta.print();

        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getTitular());

        cuenta.setTitular("Juan");
        cuenta.print();

    }

}