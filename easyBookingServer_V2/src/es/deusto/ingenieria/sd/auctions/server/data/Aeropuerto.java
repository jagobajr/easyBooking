package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Aeropuerto {
	
	private String cod;
	private String nombre;
	private String localidad;
	private int capacidad;
	
	
	public Aeropuerto(String cod, String nombre, String localidad, int capacidad) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.localidad = localidad;
		this.capacidad = capacidad;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Aeropuerto [cod=" + cod + ", nombre=" + nombre + ", localidad=" + localidad + ", capacidad=" + capacidad
				+ "]";
	}
	

}
