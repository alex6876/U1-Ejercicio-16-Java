public class Videojuego {
    String nombre;
    String genero;
    double horasJugadas;

    public Videojuego(String nombre, String genero, double horasJugadas) {
        this.nombre = nombre;
        this.genero = genero;
        if(horasJugadas >= 0){
            this.horasJugadas = horasJugadas;
        }else {
            this.horasJugadas = 0;
        }

    }

    public void registrarSesion(double horas){
        horasJugadas += horas;
    }

    public boolean esJuegiProlongado(){
        if(horasJugadas >= 50){
            return true;
        }else{
            return false;
        }
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Horas Jugadas: " + horasJugadas+"hr");
        System.out.println("Jugaste mas de 50hr?: "+ esJuegiProlongado());
    }
}
