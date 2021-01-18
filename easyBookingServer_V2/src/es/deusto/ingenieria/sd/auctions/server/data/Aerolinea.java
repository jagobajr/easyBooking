package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Aerolinea {
	private String cod;
	private String nombre;
	
	
	public Aerolinea(String cod, String nombre) {
		super();
		this.cod = cod;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Aerolinea [cod=" + cod + ", nombre=" + nombre + "]";
	}
	
	
	

}
