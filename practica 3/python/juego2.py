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
    """Juego donde el usuario debe adivinar un número entre 0 y LIMITE_SUPERIOR."""
    
    LIMITE_SUPERIOR = 10 
    
    def __init__(self, numero_de_vidas):
        super().__init__(numero_de_vidas)
        self._numero_a_adivinar = -1 

    def valida_numero(self, entero):
        """Valida que el número esté dentro del rango [0, LIMITE_SUPERIOR]."""
        return (entero >= 0 and entero <= self.LIMITE_SUPERIOR)

    def reinicia_partida(self):
        """
        Reinicia la partida y genera un nuevo número aleatorio.
        Sobreescribe el método de la clase padre.
        """
        super().reinicia_partida() 
        
        self._numero_a_adivinar = random.randint(0, self.LIMITE_SUPERIOR) 

    def juega(self):
        """Contiene el bucle principal del juego."""
        self.reinicia_partida()

        print(f"Adivina un número entre 0 y {self.LIMITE_SUPERIOR}. Tienes {self.get_numero_de_vidas()} vidas.")

        while self.get_numero_de_vidas() > 0: 
            
            try:
                entrada = input("Tu intento: ")
                intento_usuario = int(entrada)
            except ValueError:
                print("Entrada inválida. Por favor, ingresa un número entero.")
                continue

            if not self.valida_numero(intento_usuario):
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
            
class JuegoAdivinaPar(JuegoAdivinaNumero):
    
    def __init__(self, numero_de_vidas):
        super().__init__(numero_de_vidas)
    
    def valida_numero(self, entero):
        """Valida que el número esté en rango y sea PAR."""
        
        if not super().valida_numero(entero):
            print(f"El número debe estar entre 0 y {self.LIMITE_SUPERIOR}.")
            return False
        
        if entero % 2 != 0:
            print("Error: Este juego es solo para números PARES. No has perdido vida.")
            return False
        
        return True

class JuegoAdivinaImpar(JuegoAdivinaNumero):
    
    def __init__(self, numero_de_vidas):
        super().__init__(numero_de_vidas)
    
    def valida_numero(self, entero):
        """Valida que el número esté en rango y sea IMPAR."""

        if not super().valida_numero(entero):
            print(f"El número debe estar entre 0 y {self.LIMITE_SUPERIOR}.")
            return False

        if entero % 2 == 0:
            print("⚠️ Error: Este juego es solo para números IMPARES. No has perdido vida.")
            return False
        
        return True

if __name__ == "__main__":
    
    vidas = 3
    
    juego_base = JuegoAdivinaNumero(vidas)
    juego_par = JuegoAdivinaPar(vidas)
    juego_impar = JuegoAdivinaImpar(vidas)
    
    print("==========================================")
    print("      INICIO: JUEGO ADIVINA NUMERO BASE   ")
    print("==========================================")
    
    juego_base.juega()

    print("\n\n==========================================")
    print("     INICIO: JUEGO ADIVINA NUMERO PAR     ")
    print("==========================================")

    juego_par.juega()
    
    print("\n\n==========================================")
    print("    INICIO: JUEGO ADIVINA NUMERO IMPAR    ")
    print("==========================================")

    juego_impar.juega()
    
    sys.exit(0)
