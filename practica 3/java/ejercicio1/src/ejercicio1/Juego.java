package ejercicio1;

public class Juego {

    private int numeroDeVidas;
    private int record;
    private final int vidasIniciales;

    public Juego(int vidasIniciales) {
        this.numeroDeVidas = vidasIniciales;
        this.vidasIniciales = vidasIniciales; 
        this.record = 0;
    }

    public int getNumeroDeVidas() {
        return this.numeroDeVidas;
    }

    public void setNumeroDeVidas(int vidas) {

        this.numeroDeVidas = vidas;
    }

    public void reiniciaPartida() {
        System.out.println("\n--- Nueva Partida Iniciada ---");
        setNumeroDeVidas(this.vidasIniciales);
    }

    public void actualizaRecord() {
        this.record++;
        System.out.println("¡¡Acertaste!! 🎉 Nuevo récord de victorias: " + this.record);
    }

    public boolean quitaVida() {

        this.numeroDeVidas--; 
        System.out.println("Incorrecto. Te quedan " + this.numeroDeVidas + " vidas.");
        
        return getNumeroDeVidas() > 0;
    }
}
