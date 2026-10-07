package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void mostrarCursos() {
        System.out.println("Universidad: " + nombre);

        for (Curso curso : cursos) {
            curso.iniciarClase();
        }
    }
}