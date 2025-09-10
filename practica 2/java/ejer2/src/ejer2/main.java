package ejer2;

public class main {
    public static void main(String[] args) {

        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        // a) 
        Vector3D c = a.suma(b);
        System.out.println("a) Suma de a + b = (" + c.getX() + ", " + c.getY() + ", " + c.getZ() + ")");
        // b) 
        Vector3D bEscalar = a.multiplicarEscalar(2);
        System.out.println("b) 2 * a = (" + bEscalar.getX() + ", " + bEscalar.getY() + ", " + bEscalar.getZ() + ")");
        // c) 
        System.out.println("c) Longitud de a = " + a.longitud());
        // d) 
        Vector3D normalA = a.normal();
        System.out.println("d) Normal de a = (" + normalA.getX() + ", " + normalA.getY() + ", " + normalA.getZ() + ")");
        // e) 
        System.out.println("e) Producto escalar de a y b = " + a.productoEscalar(b));
        // f) 
        Vector3D productoVectorial = a.productoVectorial(b);
        System.out.println("f) Producto vectorial de a x b = (" + productoVectorial.getX() + ", " + productoVectorial.getY() + ", " + productoVectorial.getZ() + ")");

        System.out.println("¿a y b son perpendiculares u ortogonales? " + a.esPerpendicular(b));
    }
}