package ejer2;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    // a)
    public Vector3D suma(Vector3D b) {
        return new Vector3D(x + b.getX(), y + b.getY(), z + b.getZ());
    }
    // b) 
    public Vector3D multiplicarEscalar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }
    // c) 
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // d)
    public Vector3D normal() {
        double longitud = this.longitud();
        if (longitud == 0) return new Vector3D(0, 0, 0); // Evitar división por cero
        return new Vector3D(x / longitud, y / longitud, z / longitud);
    }
    // e) 
    public double productoEscalar(Vector3D b) {
        return x * b.getX() + y * b.getY() + z * b.getZ();
    }
    // f) 
    public Vector3D productoVectorial(Vector3D b) {
        double newX = y * b.getZ() - z * b.getY();
        double newY = z * b.getX() - x * b.getZ();
        double newZ = x * b.getY() - y * b.getX();
        return new Vector3D(newX, newY, newZ);
    }
    
    public boolean esPerpendicular(Vector3D b) {
        double longitudSuma = this.suma(b).longitud();
        double longitudResta = new Vector3D(x - b.getX(), y - b.getY(), z - b.getZ()).longitud();
        return Math.abs(longitudSuma - longitudResta) < 0.0001; 
    }
}