package modulo;

public class Vehiculo {
	// Atributos del Vehiculo:
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	private String patente;
	
	// Construcci�n
	Vehiculo(String marca, String modelo, String color, int anio, String patente){
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.patente = patente;
	}
	
	// Getters and Setters (get = acesador / set = modificador)	
	public String getMarca() {
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

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}


	
}
