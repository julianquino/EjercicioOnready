package modelo.vehiculos;

import vista.Vista;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo() {
		this.marca="";
		this.modelo="";
		this.precio=0.0f;
	}
	public Vehiculo(String unaMarca ,String unModelo ,float unPrecio) {
		this.marca=unaMarca;
		this.modelo=unModelo;
		this.precio=unPrecio;
	}
	
	public String getMarca(){
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	abstract public void mostrarVehiculo(Vista vista);
}
