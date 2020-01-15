package test;

import modelo.vehiculos.Auto;

import org.junit.Assert;
import org.junit.Test;

import vista.Vista;

public class VistaTest {

	@Test
	public void CambiarPrecioAformatoDeseado(){
		Vista vista = new Vista();
		float precioFormatoComun = 50000.45f;
		String nuevoFormato = vista.combertirPrecioAFormato(precioFormatoComun);
		Assert.assertEquals(nuevoFormato,"50.000,45");
	}

}
