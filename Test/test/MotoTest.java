package test;

import modelo.vehiculos.Moto;

import org.junit.Assert;
import org.junit.Test;

public class MotoTest{
	
	@Test
	public void crearMotoValoresValidosTest(){
		Moto moto = new Moto();
		Assert.assertEquals(moto.getMarca(),"");
		Assert.assertEquals(moto.getModelo(),"");
		Assert.assertEquals(moto.getPrecio(), 0.0f, 0.000f);
		Assert.assertEquals(moto.getCilindrada(), 0);
	}
	
	@Test
	public void crearMotoValoresInvalidosTest(){
		Moto moto = new Moto();
		Assert.assertEquals(moto.getMarca(),"");
		Assert.assertEquals(moto.getModelo(),"");
		Assert.assertEquals(moto.getPrecio(), 0.0f, 0.000f);
		Assert.assertEquals(moto.getCilindrada(), 0);
	}
	
	@Test
	public void asignarMarcaAMotoTest(){
		Moto moto = new Moto();
		moto.setMarca("Honda");
		Assert.assertEquals(moto.getMarca(),"Honda");
	}
	
	@Test
	public void asignarModeloAMotoTest(){
		Moto moto = new Moto();
		moto.setModelo("Titan");
		Assert.assertEquals(moto.getModelo(),"Titan");
	}
	
	@Test
	public void cambiarPrecioAMotoTest(){
		Moto moto = new Moto();
		moto.setPrecio(60000.00f);
		Assert.assertEquals(moto.getPrecio(),60000.00f,0.000f);
	}
	public void asignarCilindradaAMotoTest(){
		Moto moto = new Moto();
		moto.setCilindrada(125);
		Assert.assertEquals(moto.getCilindrada(),125);
	}
}