package modelo;

import vista.Vista;
import excepciones.VehiculoInexistente;
import modelo.vehiculos.Vehiculo;

public interface EmpresaVehicular {
	public abstract void cargarVehiculos();
	public abstract void agregarVehiculo(Vehiculo unVehiculo) throws VehiculoInexistente;
	public abstract void mostarVehiculos(Vista vista);
}
