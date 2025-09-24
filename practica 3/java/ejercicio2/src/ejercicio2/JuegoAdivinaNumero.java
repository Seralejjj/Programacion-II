package ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    
    private int numeroAAdivinar;
    
    protected static final int LIMITE_SUPERIOR = 10;
    private Scanner scanner;
    
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); 
        this.scanner = new Scanner(System.in);
    }
    
    protected boolean validaNumero(int entero) {

        return (entero >= 0 && entero <= LIMITE_SUPERIOR);
    }
    
    public void reiniciaPartida() {
        super.reiniciaPartida(); 
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(LIMITE_SUPERIOR + 1); 
    }

    public void juega() {
        reiniciaPartida();
        int intentoUsuario = -1;
        
        System.out.println("Adivina un número entre 0 y " + LIMITE_SUPERIOR + ". Tienes " + getNumeroDeVidas() + " vidas.");

        while (getNumeroDeVidas() > 0) {
            
            System.out.print("Tu intento: ");
            
            if (scanner.hasNextInt()) {
                intentoUsuario = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine();
                continue; 
            }
            
            if (!validaNumero(intentoUsuario)) {

                continue;
            }
            
            if (intentoUsuario == this.numeroAAdivinar) {
                actualizaRecord();
                return;
            } 
            
            else if (quitaVida()) { 
                String pista = (intentoUsuario < this.numeroAAdivinar) ? "mayor" : "menor";
                System.out.println("El número a adivinar es " + pista + " que " + intentoUsuario + ".");
                System.out.println("¡Inténtalo de nuevo!");
            }
            else {
                System.out.println("\n¡Has perdido! 😭 El número secreto era: " + this.numeroAAdivinar);
                return;
            }
        }
    }
}
