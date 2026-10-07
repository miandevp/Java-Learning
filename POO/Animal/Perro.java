package Animal;

public class Perro extends Animal{

    public Perro(String nombre, int edad){
        super(nombre,edad);
    }

    @Override
    public void presentarse(){
        System.out.println("Soy" + nombre + "y soy un perro");
    }

    public void ladrar(){
        System.out.println(nombre+ " dice: guau");
    }
}