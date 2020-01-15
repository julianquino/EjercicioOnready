package test;

import modelo.vehiculos.Auto;
import org.junit.Assert;
import org.junit.Test;


public class AutoTest {

	@Test
	public void crearAutoValoresValidosTest(){
		Auto auto = new Auto("Peugeot","206",200000.00f,2);
		Assert.assertEquals(auto.getMarca(),"Peugeot");
		Assert.assertEquals(auto.getModelo(),"206");
		Assert.assertEquals(auto.getPrecio(), 200000.00f, 0.000f);
		Assert.assertEquals(auto.getPuertas(), 2);
	}
	@Test
	public void crearAutoValoresInvalidosTest(){
		Auto auto = new Auto();
		Assert.assertEquals(auto.getMarca(),"");
		Assert.assertEquals(auto.getModelo(),"");
		Assert.assertEquals(auto.getPrecio(), 0.0f, 0.000f);
		Assert.assertEquals(auto.getPuertas(), 0);
	}
	
	@Test
	public void cambiarMarcaAAutoTest(){
		Auto auto = new Auto();
		auto.setMarca("Peugeot");
		Assert.assertEquals(auto.getMarca(),"Peugeot");
	}
	
	@Test
	public void cambiarModeloAAutoTest(){
		Auto auto = new Auto();
		auto.setModelo("206");
		Assert.assertEquals(auto.getModelo(),"206");
	}
	
	@Test
	public void cambiarPrecioAAutoTest(){
		Auto auto = new Auto();
		auto.setPrecio(60000.00f);
		Assert.assertEquals(auto.getPrecio(),60000.00f,0.000f);
	}
	
	@Test
	public void cambiarCantidadDePuertasAAutoTest(){
		Auto auto = new Auto();
		auto.setPuertas(4);
		Assert.assertEquals(auto.getPuertas(),4);
	}	
}
