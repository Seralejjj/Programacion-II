import math

class Vector3D:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def get_z(self):
        return self.z

    def suma(self, b):
        # a) 
        return Vector3D(self.x + b.get_x(), self.y + b.get_y(), self.z + b.get_z())

    def multiplicar_escalar(self, r):
        # b)
        return Vector3D(r * self.x, r * self.y, r * self.z)

    def longitud(self):
        # c)
        return math.sqrt(self.x * self.x + self.y * self.y + self.z * self.z)

    def normal(self):
        # d) 
        longitud = self.longitud()
        if longitud == 0:
            return Vector3D(0, 0, 0) 
        return Vector3D(self.x / longitud, self.y / longitud, self.z / longitud)

    def producto_escalar(self, b):
        # e) 
        return self.x * b.get_x() + self.y * b.get_y() + self.z * b.get_z()

    def producto_vectorial(self, b):
        # f) 
        new_x = self.y * b.get_z() - self.z * b.get_y()
        new_y = self.z * b.get_x() - self.x * b.get_z()
        new_z = self.x * b.get_y() - self.y * b.get_x()
        return Vector3D(new_x, new_y, new_z)

    def es_perpendicular(self, b):
        longitud_suma = self.suma(b).longitud()
        longitud_resta = Vector3D(self.x - b.get_x(), self.y - b.get_y(), self.z - b.get_z()).longitud()
        return abs(longitud_suma - longitud_resta) < 0.0001  

def main():
    a = Vector3D(1, 2, 3)
    b = Vector3D(4, 5, 6)
    # a) 
    c = a.suma(b)
    print("a) Suma de a + b = (", c.get_x(), ", ", c.get_y(), ", ", c.get_z(), ")")
    # b)
    b_escalar = a.multiplicar_escalar(2)
    print("b) 2 * a = (", b_escalar.get_x(), ", ", b_escalar.get_y(), ", ", b_escalar.get_z(), ")")
    # c) 
    print("c) Longitud de a =", a.longitud())
    # d) 
    normal_a = a.normal()
    print("d) Normal de a = (", normal_a.get_x(), ", ", normal_a.get_y(), ", ", normal_a.get_z(), ")")
    # e) 
    print("e) Producto escalar de a y b =", a.producto_escalar(b))
    # f)
    producto_vectorial = a.producto_vectorial(b)
    print("f) Producto vectorial de a x b = (", producto_vectorial.get_x(), ", ", producto_vectorial.get_y(), ", ", producto_vectorial.get_z(), ")")

    print("¿a y b son perpendiculares u ortogonales?", a.es_perpendicular(b))

if __name__ == "__main__":
    main()