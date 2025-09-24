import random
import sys

class Juego:
    """Clase base para juegos que usan un sistema de vidas y un récord."""
    def __init__(self, vidas_iniciales):
        self._vidas_iniciales = vidas_iniciales  
        self._numero_de_vidas = vidas_iniciales
        self._record = 0

    def get_numero_de_vidas(self):
        """Retorna el número de vidas actuales."""
        return self._numero_de_vidas

    def set_numero_de_vidas(self, vidas):
        """Establece el número de vidas."""
        self._numero_de_vidas = vidas

    def reinicia_partida(self):
        """Reinicia las vidas al valor inicial e imprime un mensaje."""
        print("\n--- Nueva Partida Iniciada ---")
        self.set_numero_de_vidas(self._vidas_iniciales)

    def actualiza_record(self):
        """Incrementa el récord e imprime un mensaje de victoria."""
        self._record += 1
        print(f"¡¡Acertaste!! 🎉 Nuevo récord de victorias: {self._record}")

    def quita_vida(self):
        """
        Decrementa una vida e informa al usuario.
        Retorna True si quedan vidas, False si no.
        """
        self._numero_de_vidas -= 1
        print(f"Incorrecto. Te quedan {self._numero_de_vidas} vidas.")
        
        return self.get_numero_de_vidas() > 0

class JuegoAdivinaNumero(Juego):
    """Juego donde el usuario debe adivinar un número entre 0 y 10."""
    def __init__(self, numero_de_vidas):
        
        super().__init__(numero_de_vidas)
        self._numero_a_adivinar = -1 

    def reinicia_partida(self):
        """
        Reinicia la partida y genera un nuevo número aleatorio.
        Sobreescribe el método de la clase padre.
        """
        super().reinicia_partida()
        
        self._numero_a_adivinar = random.randint(0, 10) 

    def juega(self):
        """Contiene el bucle principal del juego."""
        self.reinicia_partida()

        while self.get_numero_de_vidas() > 0: 
            
            try:
                
                entrada = input("Adivina un número entre 0 y 10: ")
                intento_usuario = int(entrada)
            except ValueError:
               
                print("Entrada inválida. Por favor, ingresa un número entero.")
                continue
            
            if intento_usuario == self._numero_a_adivinar:
                self.actualiza_record() 
                return
            
            elif self.quita_vida(): 
                
                pista = "mayor" if intento_usuario < self._numero_a_adivinar else "menor"
                print(f"El número a adivinar es {pista} que {intento_usuario}.")
                print("¡Inténtalo de nuevo!")
                
            else:

                print(f"\n¡Has perdido! El número secreto era: {self._numero_a_adivinar}")
                return

if __name__ == "__main__":
    
    mi_juego = JuegoAdivinaNumero(3) 
    
    mi_juego.juega()
