package Universidad;

public class Profesor {

    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void enseñar() {
        System.out.println(nombre + " está enseñando");
    }

    public String getNombre() {
        return nombre;
    }
}