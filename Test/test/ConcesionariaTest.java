package test;

import org.junit.Assert;
import org.junit.Test;

import excepciones.VehiculoInexistente;
import modelo.Concesionaria;
import modelo.vehiculos.Auto;
import modelo.vehiculos.Moto;
import modelo.vehiculos.Vehiculo;

public class ConcesionariaTest {

	@Test
	public void agregarAutoEnConcesionariaTest() throws VehiculoInexistente{
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo auto = new Auto("Peugeot" ,"206" , 200000.00f, 4);
		concesionaria.agregarVehiculo(auto);
		Assert.assertEquals(((Auto) auto).getMarca(), "Peugeot");
		Assert.assertEquals(((Auto) auto).getModelo(), "206");
		Assert.assertEquals(((Auto) auto).getPrecio(), 200000.00f, 0.000f);
		Assert.assertEquals(((Auto) auto).getPuertas(), 4);
	}
	
	@Test
	public void agregarMotoEnConcesionariaTest() throws VehiculoInexistente{
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo moto = new Moto("Honda" ,"Titan" , 60000.00f, 125);
		concesionaria.agregarVehiculo(moto);
		Assert.assertEquals(((Moto) moto).getMarca(), "Honda");
		Assert.assertEquals(((Moto) moto).getModelo(), "Titan");
		Assert.assertEquals(((Moto) moto).getPrecio(), 60000.00f, 0.000f);
		Assert.assertEquals(((Moto) moto).getCilindrada(), 125);
	}
	
	@Test
	public void soloUnVehiculoEsElMasCaroTest() throws VehiculoInexistente{
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo moto = new Moto("Honda" ,"Titan" , 60000.00f, 125);
		concesionaria.agregarVehiculo(moto);
		Vehiculo auto = new Auto("Peugeot", "208", 250000.00f, 5);
		concesionaria.agregarVehiculo(auto);
		int numeroDeVehiculosConElMismoPrecio = concesionaria.vehiculoMasCaro().size();
		Assert.assertEquals(numeroDeVehiculosConElMismoPrecio,1);
		Assert.assertEquals(concesionaria.vehiculoMasCaro().get(0).getMarca(),"Peugeot");
	}
	
	@Test
	public void dosVehiculosMasCarosConElMismoPrecioTest() throws VehiculoInexistente{
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo moto = new Moto("Honda" ,"Titan" , 60000.00f, 125);
		concesionaria.agregarVehiculo(moto);
		Vehiculo auto = new Auto("Peugeot", "208", 250000.00f, 5);
		concesionaria.agregarVehiculo(auto);
		Vehiculo auto2 = new Auto("Oreo", "210", 250000.00f, 3);
		concesionaria.agregarVehiculo(auto2);
		int numeroDeVehiculosConElMismoPrecio = concesionaria.vehiculoMasCaro().size();
		Assert.assertEquals(numeroDeVehiculosConElMismoPrecio,2);
	}
	
	@Test
	public void buscarUnVehiculoConLaLetraZTest() throws VehiculoInexistente{
		Concesionaria concesionaria = new Concesionaria();
		Vehiculo moto = new Moto("Honda" ,"Titan" , 60000.00f, 125);
		concesionaria.agregarVehiculo(moto);
		Vehiculo auto = new Auto("Peugeot", "ZRR", 250000.00f, 5);
		concesionaria.agregarVehiculo(auto);
		Vehiculo auto2 = new Auto("Oreo", "210", 250000.00f, 3);
		concesionaria.agregarVehiculo(auto2);
		int numeroDeVehiculosConElMismoPrecio = concesionaria.encontrarModeloDeVehiculoConLetra('Z').size();
		Assert.assertEquals(numeroDeVehiculosConElMismoPrecio,1);
		Assert.assertEquals(concesionaria.encontrarModeloDeVehiculoConLetra('Z').get(0).getMarca(),"Peugeot");
	}
}
