public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Alan Wake", "Terror", 0);
        juego1.registrarSesion(15);
        juego1.registrarSesion(15);
        juego1.registrarSesion(15);
        juego1.registrarSesion(28);
        juego1.mostrar();
    }
}