#!/usr/bin/env python
# -*- coding: utf-8 -*-

from fabricas import *

class EjemploAbstractFactory:
    def obtener_nombre(self):
        return "AbstractFactory"

    def operacion(self):
        print("Ej1emplo Abstract Factory")
        print("seleccione una fabrica: \n\t 0 - AMD \n\t 1 - Intel \n\t 2 - Alien ")
        fabricas = [FabricaAMD(), FabricaIntel(), FabricaAlien()]

        fabrica = fabricas[int(input())]

        partes = [fabrica.crearMemoria(), fabrica.crearProcesador(), fabrica.crearBoard()]

        for p in partes:
            p.implementacion()
            p.operacion()
if __name__ == "__main__":
    """
    The client code can work with any concrete factory class.
    """
    ejemplo = EjemploAbstractFactory()
    ejemplo.operacion()





    
