

package Empresa1;


public class Main{


    public static void main( String [] args ){

        Empleado e1 =   new Programador("Manuel", 21);
        Empleado e2 =   new Diseñador("Ana", 23);

        e1.trabajar();
        e2.trabajar();


        if(e1 instanceof Programador){
            Programador p = (Programador) e1;
            p.programar();
        }

        if(e2 instanceof Diseñador){
            Diseñador d = (Diseñador) e2;
            d.usarPhotoshop();
        }







    }


}