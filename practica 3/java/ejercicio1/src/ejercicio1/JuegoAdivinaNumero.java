package ejercicio1;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    
    private int numeroAAdivinar;
    private Scanner scanner;
    
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas); 
        this.scanner = new Scanner(System.in);
    }
    
    public void reiniciaPartida() {
        super.reiniciaPartida(); 
        
        Random random = new Random();
        this.numeroAAdivinar = random.nextInt(11); 
    }

    public void juega() {
        reiniciaPartida();

        int intentoUsuario = -1;
        
        while (getNumeroDeVidas() > 0) { 
            
            System.out.print("Adivina un número entre 0 y 10: ");
            
            if (scanner.hasNextInt()) {
                intentoUsuario = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                scanner.nextLine();
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
