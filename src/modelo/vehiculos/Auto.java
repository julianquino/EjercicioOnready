package modelo.vehiculos;

import vista.Vista;

public class Auto extends Vehiculo{
	private int puertas;
	public Auto() {
		this.puertas=0;
	}public Auto(String unaMarca ,String unModelo ,float unPrecio,int cantPuertas) {
		super(unaMarca ,unModelo ,unPrecio);
		this.puertas=cantPuertas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int cantPuertas) {
		this.puertas = cantPuertas;
	}
	
	public void mostrarVehiculo(Vista vista){
		vista.mostrarPorPantallaAuto(this);
	}
}
