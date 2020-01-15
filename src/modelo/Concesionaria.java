package modelo;

import java.util.ArrayList;
import java.util.Collections;

import vista.Vista;
import modelo.vehiculos.Auto;
import modelo.vehiculos.Moto;
import modelo.vehiculos.Vehiculo;
import excepciones.VehiculoInexistente;

public class Concesionaria implements EmpresaVehicular{

	public ArrayList<Vehiculo> vehiculos;
	public Concesionaria() {
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	public void cargarVehiculos(){
    	try {
//Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
    		Vehiculo auto1 = new Auto("Peugeot", "206", 200000.00f, 4);
    		this.agregarVehiculo(auto1);
//Marca: Honda // Modelo: Titan // Cilindrada: 125c // Precio: $60.000,00
    		Vehiculo moto1 = new Moto("Honda", "Titan", 60000.00f, 125);
    		this.agregarVehiculo(moto1);
//Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
    		Vehiculo auto2 = new Auto("Peugeot", "208", 250000.00f, 5);
    		this.agregarVehiculo(auto2);
//Marca: Yamaha // Modelo: YBR // Cilindrada: 160c // Precio: $80.500,50
    		Vehiculo moto2 = new Moto("Yamaha", "YBR", 80500.50f, 160);
    		this.agregarVehiculo(moto2);
    	} catch (VehiculoInexistente ex){
        	System.out.println("no existe vehiculo");
        }
     
    }
	public void agregarVehiculo(Vehiculo unVehiculo)throws VehiculoInexistente{
		if(unVehiculo==null){
			throw new VehiculoInexistente();
		}else{
			this.vehiculos.add(unVehiculo);
		}
	}
	public void mostarVehiculos(Vista vista){
		for (int i = 0; i < vehiculos.size(); i++) {
		      vehiculos.get(i).mostrarVehiculo(vista);
		}
	}
	public ArrayList<Vehiculo> vehiculoMasCaro(){
		ArrayList<Vehiculo> vehiculosMasCaros = new ArrayList<Vehiculo>();
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculosMasCaros.size()==0){
				vehiculosMasCaros.add(vehiculos.get(i));
			}else if(vehiculos.get(i).getPrecio()==vehiculosMasCaros.get(0).getPrecio()){
				vehiculosMasCaros.add(vehiculos.get(i));
			}else if(vehiculos.get(i).getPrecio()>vehiculosMasCaros.get(0).getPrecio()){
				vehiculosMasCaros.clear();
				vehiculosMasCaros.add(vehiculos.get(i));
			}
		}
		return vehiculosMasCaros;
	}
	public ArrayList<Vehiculo> vehiculoMasBarato() {
		ArrayList<Vehiculo> vehiculosMasBaratos = new ArrayList<Vehiculo>();
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculosMasBaratos.size()==0){
				vehiculosMasBaratos.add(vehiculos.get(i));
			}else if(vehiculos.get(i).getPrecio()==vehiculosMasBaratos.get(0).getPrecio()){
				vehiculosMasBaratos.add(vehiculos.get(i));
			}else if(vehiculos.get(i).getPrecio()<vehiculosMasBaratos.get(0).getPrecio()){
				vehiculosMasBaratos.clear();
				vehiculosMasBaratos.add(vehiculos.get(i));
			}
		}
		return vehiculosMasBaratos;	
	}
	public ArrayList<Vehiculo> encontrarModeloDeVehiculoConLetra(char letra) {
		ArrayList<Vehiculo> vehiculosConLetra = new ArrayList<Vehiculo>();
		for (int i = 0; i < vehiculos.size(); i++) {
			String modelo=vehiculos.get(i).getModelo();
			if(-1 != modelo.indexOf(letra)){
				vehiculosConLetra.add(vehiculos.get(i));
			}
		}
		return vehiculosConLetra;
	}
	public ArrayList<Vehiculo> mostrarVehiculosOrdenadosDeMayorAmenor() {
		ArrayList<Vehiculo> vehiculosCopia =  new ArrayList<Vehiculo>(this.vehiculos);
		Collections.sort(vehiculosCopia,new CompararVehiculos());
        return vehiculosCopia;
	}
}
