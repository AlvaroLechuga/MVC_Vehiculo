package dam.vehiculos.IDAO;

import java.util.List;

import dam.vehiculos.recursos.Vehiculo;

public interface IDAOVehiculo 
{ public int insertarVehiculo(Vehiculo vehiculo);
  public int modificarVehiculo(Vehiculo vehiculo);
  public int eliminarVehiculo(String matricula);
  public int eliminarVehiculos(List<Vehiculo> lstVehiculos);
  public Vehiculo getVehiculo(String matricula);
  public  List<Vehiculo> getVehiculos();
 


  
	
	

}
