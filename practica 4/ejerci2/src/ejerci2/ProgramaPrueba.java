package ejerci2;

import java.util.Random;

public class ProgramaPrueba {
    
    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro"};

        System.out.println("Creando Arreglo de Figuras Aleatorias");

        for (int i = 0; i < figuras.length; i++) {
        	
            int tipoFigura = rand.nextInt(2) + 1; 
            String colorAsignado = colores[rand.nextInt(colores.length)];

            if (tipoFigura == 1) {

                double lado = 1.0 + (10.0 - 1.0) * rand.nextDouble();
                figuras[i] = new Cuadrado(colorAsignado, lado);
                System.out.printf("Creado: Cuadrado (Lado: %.2f)\n", lado);
            } else { 

                double radio = 1.0 + (10.0 - 1.0) * rand.nextDouble();
                figuras[i] = new Circulo(colorAsignado, radio);
                System.out.printf("Creado: Círculo (Radio: %.2f)\n", radio);
            }
        }

        System.out.println("\n Análisis Polimórfico de Figuras");
        
        for (Figura figura : figuras) {
            
            System.out.println("\n" + figura.toString()); 

            System.out.printf("  Área: %.2f\n", figura.area());
            System.out.printf("  Perímetro: %.2f\n", figura.perimetro());

            if (figura instanceof Coloreado) {
                Coloreado objColoreado = (Coloreado) figura;
                System.out.println("  Coloreado: " + objColoreado.comoColorear());
            }
        }
    }
}