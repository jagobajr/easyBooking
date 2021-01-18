package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Vuelo {
	private String cod;
	private int fechaSalida;
	private int fechaLlegada;
	private int asientosTot;
	private int asientosRes;
	private double precio;
	private Aeropuerto aeropuerto_destino;
	private Aeropuerto aeropuerto_origen;
	private Aerolinea aerolinea;
	
	public Vuelo(String cod, int fechaSalida, int fechaLlegada, int asientosTot, int asientosRes, double precio,
			Aeropuerto aeropuerto_destino, Aeropuerto aeropuerto_origen, Aerolinea aerolinea) {
		super();
		this.cod = cod;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.asientosTot = asientosTot;
		this.asientosRes = asientosRes;
		this.precio = precio;
		this.aeropuerto_destino = aeropuerto_destino;
		this.aeropuerto_origen = aeropuerto_origen;
		this.aerolinea = aerolinea;
	}
	public Vuelo() {
		super();
		this.cod = "";
		this.fechaSalida = 0;
		this.fechaLlegada = 0;
		this.asientosTot = 0;
		this.asientosRes = 0;
		this.precio = 0;
		this.aeropuerto_destino = null;
		this.aeropuerto_origen = null;
		this.aerolinea = null;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(int fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public int getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(int fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public int getAsientosTot() {
		return asientosTot;
	}
	public void setAsientosTot(int asientosTot) {
		this.asientosTot = asientosTot;
	}
	public int getAsientosRes() {
		return asientosRes;
	}
	public void setAsientosRes(int asientosRes) {
		this.asientosRes = asientosRes;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Aeropuerto getAeropuerto_destino() {
		return aeropuerto_destino;
	}
	public void setAeropuerto_destino(Aeropuerto aeropuerto_destino) {
		this.aeropuerto_destino = aeropuerto_destino;
	}
	public Aeropuerto getAeropuerto_origen() {
		return aeropuerto_origen;
	}
	public void setAeropuerto_origen(Aeropuerto aeropuerto_origen) {
		this.aeropuerto_origen = aeropuerto_origen;
	}
	public Aerolinea getTipo() {
		return aerolinea;
	}
	public void setTipo(Aerolinea tipo) {
		this.aerolinea = tipo;
	}
	@Override
	public String toString() {
		return "Vuelo [cod=" + cod + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada
				+ ", asientosTot=" + asientosTot + ", asientosRes=" + asientosRes + ", precio=" + precio
				+ ", aeropuerto_destino=" + aeropuerto_destino + ", aeropuerto_origen=" + aeropuerto_origen + ", tipo="
				+ aerolinea + "]";
	}
	
	
}
