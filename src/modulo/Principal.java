package modulo;

public class Principal {
	
	// Negocio de Transporte
	
/* Entidades relacionados al transporte:
* - Conductor;
* - Pasajeros;
* - Vehiculos;
* - Aplicacion;
* - Tarifa;
*/
	
	//CREAR EL PROGRAMA

	public static void main(String[] args) {
		System.out.println("Crear aplicacion");
		Aplicacion aplicacion = new Aplicacion ("UBER ", 3);
		System.out.println("La aplicacion en uso es "+ aplicacion.getNombre()+ "version" + Integer.toString(aplicacion.getVersion()));
		System.out.println("----------------------");
		
		System.out.println("Crear usuario");
		Usuario usuario = new Usuario(1, "Peluca", 99, "Santiago");
		System.out.println("Se creio el usuario " + usuario.getNombre());
		System.out.println("----------------------");
		
		System.out.println("Crear conductor");
		Conductor conductor = new Conductor(2,"Tobi",1234,new Vehiculo("Renault","Symbol","Gris",2020,"AXBX20"));
/* SEGUNDA OPCION PARA DEFINIR EL 2do CONSTRUCTOR
 * 		Vehiculo vehiculo = new Vehiculo("Renault","Symbol","Gris",2020,"AXBX20");
 * 		Conductor conductor = new Conductor(2,"Tobi",1234, vehiculo);
 */
		System.out.println("Se creio el usuario " + usuario.getNombre());
		System.out.println("----------------------");
		
		System.out.println("Crear viaje ");
		Viaje viaje = new Viaje(aplicacion, conductor, usuario, "Alameda 1340 ", "Vitacura 987 ", "20:24");
		System.out.println("Se creio el viaje desde " + viaje.getDireccionOrigen() + "hasta " + viaje.getDireccionDestino());
		System.out.println("El conductor es " + viaje.getConductor().getNombre() + " y el usuario es " + viaje.getUsuario().getNombre());
		System.out.println("----------------------");
		
		viaje.setTiempo(43);
		viaje.setTarifa(7000);
		System.out.println("Su viaje termino, tuvo una duracion de " + Integer.toString(viaje.getTiempo()));
		

		
		

	}

}
