package modelo;

import java.util.Comparator;
import modelo.vehiculos.Vehiculo;
public class CompararVehiculos implements Comparator<Vehiculo>{
	
	public int compare(Vehiculo unVehiculo, Vehiculo otroVehiculo){
       if(unVehiculo.getPrecio()>otroVehiculo.getPrecio()){
           return -1;
       }else if(unVehiculo.getPrecio()<otroVehiculo.getPrecio()){
           return 0;
       }else{
           return 1;
       }
   }
}
