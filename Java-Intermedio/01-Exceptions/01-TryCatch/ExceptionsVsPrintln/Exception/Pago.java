package Exception;

public class Pago {

    public void realizarPago(double monto) {

        if (monto > 100) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }

        System.out.println("Pago realizado");
    }
}