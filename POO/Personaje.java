public class Personaje {

    String nombre;
    int vida;
    int nivel;
    int ataque;

    void atacar() {
        System.out.println(nombre + " ataca con " + ataque + " de daño.");
    }

    void recibirDanio(int danio) {
        vida -= danio;
        System.out.println(nombre + " recibió " + danio + " de daño.");
    }

    void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ataque: " + ataque);
    }
}