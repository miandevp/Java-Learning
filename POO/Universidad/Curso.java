package Universidad;

public class Curso {

    private String nombre;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public void iniciarClase() {
        System.out.println("Iniciando curso de " + nombre);
        profesor.enseñar();
    }
}