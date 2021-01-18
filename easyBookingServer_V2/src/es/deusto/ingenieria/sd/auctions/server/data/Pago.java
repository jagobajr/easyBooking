package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;


@PersistenceCapable
public class Pago {
	private int fecha;
	private double importe;
	private Metodo_pago metodoPago;
	
	public Pago(int fecha, double importe, Metodo_pago metodoPago) {
		super();
		this.fecha = fecha;
		this.importe = importe;
		this.metodoPago = metodoPago;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Metodo_pago getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(Metodo_pago metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	@Override
	public String toString() {
		return "Pago [fecha=" + fecha + ", importe=" + importe + ", metodoPago=" + metodoPago + "]";
	}
	
	
	

	
	
}
