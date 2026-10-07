package Calculadora;

public class Calculadora{

    public int sumar(int a,int b){
        return a + b;
    }

    public double sumar(  double a,double b){
        return a + b;
    }

    public int sumar(int a,int b,int c){
        return a + b +c;
    }

    public static int multiplicar (int a ,int b){
        return a * b;
    }

    public final void mostrarMensaje(){
        System.out.println("Calculadora, Funcionando");
    }



}