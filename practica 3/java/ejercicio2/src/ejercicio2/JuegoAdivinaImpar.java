package ejercicio2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    
    protected boolean validaNumero(int entero) {

        if (!super.validaNumero(entero)) {
            System.out.println("El número debe estar entre 0 y " + LIMITE_SUPERIOR + ".");
            return false;
        }
        
        if (entero % 2 == 0) {
            System.out.println("⚠️ Error: Este juego es solo para números IMPARES. No has perdido vida.");
            return false;
        }
        
        return true;
    }
}
