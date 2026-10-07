package Calculadora;

public class Main{

    public static void main(String[] args ){

        Calculadora calculadora = new Calculadora();


        int resultado1  = calculadora.sumar(5,3);

        double resultado2 = calculadora.sumar(5.5,2.5);

        int resultado3 = calculadora.sumar(1,2,3);

        int resultado4 = Calculadora.multiplicar(4,5);

        calculadora.mostrarMensaje();

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

    }


}