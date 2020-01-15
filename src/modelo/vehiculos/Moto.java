package modelo.vehiculos;

import vista.Vista;

public class Moto extends Vehiculo{

	private int cilindrada;
	public Moto(){
		super();
		this.cilindrada=0;
	}
	public Moto(String unaMarca ,String unModelo ,float unPrecio,int cantCilindrada){
		super(unaMarca ,unModelo ,unPrecio);
		this.cilindrada=cantCilindrada;
	}
	public Moto(int cantCilindrada){
		super();
		this.cilindrada=cantCilindrada;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cantCilindrada) {
		this.cilindrada = cantCilindrada;
	}
	public void mostrarVehiculo(Vista vista){
		vista.mostrarPorPantallaMoto(this);
	}

}
