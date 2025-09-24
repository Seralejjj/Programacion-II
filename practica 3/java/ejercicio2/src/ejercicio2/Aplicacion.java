package ejercicio2;

public class Aplicacion {
    public static void main(String[] args) {
        
        int vidas = 3;
        
        JuegoAdivinaNumero juegoBase = new JuegoAdivinaNumero(vidas);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(vidas);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(vidas);
        
        System.out.println("==========================================");
        System.out.println("      INICIO: JUEGO ADIVINA NUMERO BASE   ");
        System.out.println("==========================================");
        
        juegoBase.juega();

        System.out.println("\n\n==========================================");
        System.out.println("     INICIO: JUEGO ADIVINA NUMERO PAR     ");
        System.out.println("==========================================");

        juegoPar.juega();
        
        System.out.println("\n\n==========================================");
        System.out.println("    INICIO: JUEGO ADIVINA NUMERO IMPAR    ");
        System.out.println("==========================================");

        juegoImpar.juega();
        
        System.exit(0);
    }
}