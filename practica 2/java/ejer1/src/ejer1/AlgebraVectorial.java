package ejer1;

public class AlgebraVectorial {
    private double x;
    private double y;

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    // a) 
    public boolean perpendicular(AlgebraVectorial b) {
        double magnitudSuma = Math.sqrt(Math.pow(x + b.getX(), 2) + Math.pow(y + b.getY(), 2));
        double magnitudResta = Math.sqrt(Math.pow(x - b.getX(), 2) + Math.pow(y - b.getY(), 2));
        return Math.abs(magnitudSuma - magnitudResta) < 0.0001; 
    }
    // b)
    public boolean perpendicularMutuamente(AlgebraVectorial b) {
        double magnitudRestaAB = Math.sqrt(Math.pow(x - b.getX(), 2) + Math.pow(y - b.getY(), 2));
        double magnitudRestaBA = Math.sqrt(Math.pow(b.getX() - x, 2) + Math.pow(b.getY() - y, 2));
        return Math.abs(magnitudRestaAB - magnitudRestaBA) < 0.0001;
    }
    // c) 
    public boolean perpendicularProductoEscalar(AlgebraVectorial b) {
        double productoEscalar = x * b.getX() + y * b.getY();
        return Math.abs(productoEscalar) < 0.0001; 
    }
    // d) 
    public boolean perpendicularPitagoras(AlgebraVectorial b) {
        double magnitudSumaCuadrado = Math.pow(x + b.getX(), 2) + Math.pow(y + b.getY(), 2);
        double magnitudACuadrado = Math.pow(x, 2) + Math.pow(y, 2);
        double magnitudBCuadrado = Math.pow(b.getX(), 2) + Math.pow(b.getY(), 2);
        return Math.abs(magnitudSumaCuadrado - (magnitudACuadrado + magnitudBCuadrado)) < 0.0001; 
    }
    // e)
    public boolean paralela(AlgebraVectorial b) {
        if (b.getX() == 0 && b.getY() == 0) return false; 
        double rX = x / b.getX();
        double rY = y / b.getY();
        return Math.abs(rX - rY) < 0.0001 && !Double.isNaN(rX) && !Double.isInfinite(rX); 
    }
    // f) 
    public boolean paralelaCruz(AlgebraVectorial b) {
        double determinante = x * b.getY() - y * b.getX();
        return Math.abs(determinante) < 0.0001; 
    }
    // g)
    public AlgebraVectorial proyeccionSobreB(AlgebraVectorial b) {
        double productoEscalar = x * b.getX() + y * b.getY();
        double magnitudBCuadrado = Math.pow(b.getX(), 2) + Math.pow(b.getY(), 2);
        if (magnitudBCuadrado == 0) return new AlgebraVectorial(0, 0);
        double factor = productoEscalar / magnitudBCuadrado;
        return new AlgebraVectorial(factor * b.getX(), factor * b.getY());
    }
    // h)
    public double componenteEnB(AlgebraVectorial b) {
        double magnitudB = Math.sqrt(Math.pow(b.getX(), 2) + Math.pow(b.getY(), 2));
        if (magnitudB == 0) return 0; 
        return (x * b.getX() + y * b.getY()) / magnitudB;
    }
}