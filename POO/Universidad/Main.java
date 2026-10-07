package Universidad;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Michael");

        Curso curso1 = new Curso("Programación Orientada a Objetos", profesor);
        Curso curso2 = new Curso("Algoritmos", profesor);

        Universidad universidad = new Universidad("Universidad Nacional");

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);

        universidad.mostrarCursos();
    }
}