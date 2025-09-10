import math

class AlgebraVectorial:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def get_x(self):
        return self.x

    def get_y(self):
        return self.y

    def perpendicular(self, b):
        # a)
        magnitud_suma = math.sqrt((self.x + b.get_x())**2 + (self.y + b.get_y())**2)
        magnitud_resta = math.sqrt((self.x - b.get_x())**2 + (self.y - b.get_y())**2)
        return abs(magnitud_suma - magnitud_resta) < 0.0001  

    def perpendicular_mutuamente(self, b):
        # b)
        magnitud_resta_ab = math.sqrt((self.x - b.get_x())**2 + (self.y - b.get_y())**2)
        magnitud_resta_ba = math.sqrt((b.get_x() - self.x)**2 + (b.get_y() - self.y)**2)
        return abs(magnitud_resta_ab - magnitud_resta_ba) < 0.0001  

    def perpendicular_producto_escalar(self, b):
        # c)
        producto_escalar = self.x * b.get_x() + self.y * b.get_y()
        return abs(producto_escalar) < 0.0001  

    def perpendicular_pitagoras(self, b):
        # d)
        magnitud_suma_cuadrado = (self.x + b.get_x())**2 + (self.y + b.get_y())**2
        magnitud_a_cuadrado = self.x**2 + self.y**2
        magnitud_b_cuadrado = b.get_x()**2 + b.get_y()**2
        return abs(magnitud_suma_cuadrado - (magnitud_a_cuadrado + magnitud_b_cuadrado)) < 0.0001  

    def paralela(self, b):
        # e) 
        if b.get_x() == 0 and b.get_y() == 0:
            return False  
        r_x = self.x / b.get_x()
        r_y = self.y / b.get_y()
        return abs(r_x - r_y) < 0.0001 and not math.isnan(r_x) and not math.isinf(r_x)  

    def paralela_cruz(self, b):
        # f) 
        determinante = self.x * b.get_y() - self.y * b.get_x()
        return abs(determinante) < 0.0001  

    def proyeccion_sobre_b(self, b):
        # g) 
        producto_escalar = self.x * b.get_x() + self.y * b.get_y()
        magnitud_b_cuadrado = b.get_x()**2 + b.get_y()**2
        if magnitud_b_cuadrado == 0:
            return AlgebraVectorial(0, 0)  
        factor = producto_escalar / magnitud_b_cuadrado
        return AlgebraVectorial(factor * b.get_x(), factor * b.get_y())

    def componente_en_b(self, b):
        # h) 
        magnitud_b = math.sqrt(b.get_x()**2 + b.get_y()**2)
        if magnitud_b == 0:
            return 0  
        return (self.x * b.get_x() + self.y * b.get_y()) / magnitud_b

def main():
    a = AlgebraVectorial(3, 4)
    b = AlgebraVectorial(4, -3)

    print("a) ¿a y b son perpendiculares (|a + b| = |a - b|)?", a.perpendicular(b))
    print("b) ¿a y b son mutuamente perpendiculares (|a - b| = |b - a|)?", a.perpendicular_mutuamente(b))
    print("c) ¿a y b son perpendiculares (a · b = 0)?", a.perpendicular_producto_escalar(b))
    print("d) ¿a y b son perpendiculares (|a + b|² = |a|² + |b|²)?", a.perpendicular_pitagoras(b))

    c = AlgebraVectorial(2, 4)  
    print("e) ¿a y c son paralelos (a = r * c)?", a.paralela(c))
    print("f) ¿a y c son paralelos (a × c = 0)?", a.paralela_cruz(c))

    proyeccion = a.proyeccion_sobre_b(b)
    print(f"g) Proyección de a sobre b: ({proyeccion.get_x()}, {proyeccion.get_y()})")
    print("h) Componente de a en la dirección de b:", a.componente_en_b(b))

if __name__ == "__main__":
    main()