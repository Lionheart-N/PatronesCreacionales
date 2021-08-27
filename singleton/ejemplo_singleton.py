from singleton import Singleton

class EjemploSingleton:
    def obtener_nombre(self):
        return "Singleton"

    def operacion(self):
        print("Ejemplo Singleton")
        x = Singleton.get_instance()
        y = Singleton.get_instance()

        print( x is y)

        y.set_value(1)

        print(y.get_value())
if __name__ == "__main__":
    """
    The client code can work with any concrete factory class.
    """
    ejemplo = EjemploSingleton()
    ejemplo.operacion()



