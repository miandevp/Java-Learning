package Animal;

public class Main{


    public static void main(String []args){

        Perro perro = new Perro("Max",25);
        Gato gato = new Gato("Bonita",12);

        perro.presentarse();
        perro.ladrar();
        perro.respirar();

        gato.presentarse();
        gato.respirar();



    }


}