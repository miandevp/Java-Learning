public class Main {

    public static void main(String[] args) {

        Personaje personaje = new Personaje();

        personaje.nombre = "Guerrero";
        personaje.vida = 100;
        personaje.nivel = 1;
        personaje.ataque = 20;

        personaje.mostrarEstado();
        personaje.atacar();
        personaje.recibirDanio(30);
        personaje.mostrarEstado();
    }
}x|