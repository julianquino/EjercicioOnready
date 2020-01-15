package vista;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

import modelo.vehiculos.Auto;
import modelo.vehiculos.Moto;
import modelo.vehiculos.Vehiculo;

public class Vista{
	
	private DecimalFormatSymbols formatoDePrecio;
	private DecimalFormat precioPorPantalla;
	
	public Vista(){
		this.formatoDePrecio = new DecimalFormatSymbols();
		this.formatoDePrecio.setDecimalSeparator(',');
		this.precioPorPantalla = new DecimalFormat("###,###.00",this.formatoDePrecio);
	}
	public String combertirPrecioAFormato(float unPrecio){
		String nuevoFormato = this.precioPorPantalla.format(unPrecio);	
		return nuevoFormato;
	}
	public void mostrarPorPantallaAuto(Auto auto){
		System.out.printf("Marca: "+auto.getMarca()+" // Modelo: "+auto.getModelo()+" // Puertas: "+auto.getPuertas()+" // Precio: $"+combertirPrecioAFormato(auto.getPrecio())+"\n");
	}
	public void mostrarPorPantallaMoto(Moto moto){
		System.out.printf("Marca: "+moto.getMarca()+" // Modelo: "+moto.getModelo()+" // Cilindrada: "+moto.getCilindrada()+"c // Precio: $"+combertirPrecioAFormato(moto.getPrecio())+"\n");
	}
	public void mostrarPorPantalla(String unMensaje){
		System.out.printf(unMensaje);
	}
	public void mostrarPorPantallaMarcaYModelo(ArrayList<Vehiculo> vehiculos) {
		for(Vehiculo unVehiculo: vehiculos){
			System.out.printf(unVehiculo.getMarca()+" "+unVehiculo.getModelo()+"\n");	
		}
	}
	public void mostrarPorPantallaVehiculoConLetra(ArrayList<Vehiculo> vehiculosConLetra) {	
		System.out.printf("Vehiculo que contiene en el modelo la letra ÅeYÅf: ");
		if(vehiculosConLetra.size()==0){
			System.out.printf("No hay vehiculo con esa letra\n");
		}else {
			for(Vehiculo unVehiculo: vehiculosConLetra){
				System.out.printf(unVehiculo.getMarca()+" "+unVehiculo.getModelo()+" $"+combertirPrecioAFormato(unVehiculo.getPrecio())+"\n");
			}
		}
	}
	public void mostrarPorPantallaVehiculosOrdenadorPorMayor(ArrayList<Vehiculo> vehiculos) {	
		if(vehiculos.size()==0){
			System.out.printf("no hay vehiculos cargados\n");
		}else{
			System.out.printf("Vehiculos ordenados por precio de mayor a menor:\n");
			this.mostrarPorPantallaMarcaYModelo(vehiculos);
		}
	}
	public void mostrarPorPantallaSeparador() {
		System.out.printf("=============================\n");	
	}
	public void mostrarPorPantallaMasCaro(ArrayList<Vehiculo> vehiculosMasCaros) {
		if(vehiculosMasCaros.size()==0){
			System.out.printf("no hay vehiculos cargados\n");
		}else{
			if(vehiculosMasCaros.size()==1){
				System.out.printf("Vehiculo mas caro: ");
			}else{
				System.out.printf("Vehiculos mas caros: ");
			}
			this.mostrarPorPantallaMarcaYModelo(vehiculosMasCaros);
		}	
	}

	public void mostrarPorPantallaMasBarato(ArrayList<Vehiculo> vehiculosMasBaratos) {
		if(vehiculosMasBaratos.size()==0){
			System.out.printf("no hay vehiculos cargados\n");
		}else{
			if(vehiculosMasBaratos.size()==1){
				System.out.printf("Vehiculo mas barato: ");
			}else{
				System.out.printf("Vehiculos mas baratos: ");
			}
			this.mostrarPorPantallaMarcaYModelo(vehiculosMasBaratos);
		}	
		
	}
}
