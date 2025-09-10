package ejer1;

public class main {
    public static void main(String[] args) {
 
        AlgebraVectorial a = new AlgebraVectorial(3, 4);
        AlgebraVectorial b = new AlgebraVectorial(4, -3);

        System.out.println("a) ¿a y b son perpendiculares (|a + b| = |a - b|)? " + a.perpendicular(b));
        System.out.println("b) ¿a y b son mutuamente perpendiculares (|a - b| = |b - a|)? " + a.perpendicularMutuamente(b));
        System.out.println("c) ¿a y b son perpendiculares (a · b = 0)? " + a.perpendicularProductoEscalar(b));
        System.out.println("d) ¿a y b son perpendiculares (|a + b|² = |a|² + |b|²)? " + a.perpendicularPitagoras(b));

        AlgebraVectorial c = new AlgebraVectorial(2, 4); 
        System.out.println("e) ¿a y c son paralelos (a = r * c)? " + a.paralela(c));
        System.out.println("f) ¿a y c son paralelos (a × c = 0)? " + a.paralelaCruz(c));

        AlgebraVectorial proyeccion = a.proyeccionSobreB(b);
        System.out.println("g) Proyección de a sobre b: (" + proyeccion.getX() + ", " + proyeccion.getY() + ")");
        System.out.println("h) Componente de a en la dirección de b: " + a.componenteEnB(b));
    }
}