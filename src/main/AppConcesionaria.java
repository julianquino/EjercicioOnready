package main;

import modelo.Concesionaria;
import vista.Vista;

public class AppConcesionaria{
	
    public static void main (String args[]) {
    	Concesionaria concesionaria = new Concesionaria();
    	Vista vista = new Vista();
    	concesionaria.cargarVehiculos();
    	concesionaria.mostarVehiculos(vista);
    	vista.mostrarPorPantallaSeparador();
    	vista.mostrarPorPantallaMasCaro(concesionaria.vehiculoMasCaro());
    	vista.mostrarPorPantallaMasBarato(concesionaria.vehiculoMasBarato());
    	vista.mostrarPorPantallaVehiculoConLetra(concesionaria.encontrarModeloDeVehiculoConLetra('Y'));
    	vista.mostrarPorPantallaSeparador();
    	vista.mostrarPorPantallaVehiculosOrdenadorPorMayor(concesionaria.mostrarVehiculosOrdenadosDeMayorAmenor());
    }
}
