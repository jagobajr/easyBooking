package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Reserva {

		private int fecha;
		private double importe;
		private int num_pasajeros;
		private Usuario pasajero;
		private Vuelo vuelo;
		private Metodo_pago pago;
		
		public Reserva(int fecha, double importe, int num_pasajeros, Usuario pasajero, Vuelo vuelo, Metodo_pago pago) {
			super();
			this.fecha = fecha;
			this.importe = importe;
			this.num_pasajeros = num_pasajeros;
			this.pasajero = pasajero;
			this.vuelo = vuelo;
			this.pago = pago;
		}
		
		public Reserva() {
			super();
			this.fecha = 0;
			this.importe = 0.0;
			this.num_pasajeros = 0;
			this.pasajero = null;
			this.vuelo = null;
			this.pago = null;
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

		public int getNum_pasajeros() {
			return num_pasajeros;
		}

		public void setNum_pasajeros(int num_pasajeros) {
			this.num_pasajeros = num_pasajeros;
		}

		public Usuario getPasajero() {
			return pasajero;
		}

		public void setPasajero(Usuario pasajero) {
			this.pasajero = pasajero;
		}

		public Vuelo getVuelo() {
			return vuelo;
		}

		public void setVuelo(Vuelo vuelo) {
			this.vuelo = vuelo;
		}

		public Metodo_pago getPago() {
			return pago;
		}

		public void setPago(Metodo_pago pago) {
			this.pago = pago;
		}

		@Override
		public String toString() {
			return "Reserva [fecha=" + fecha + ", importe=" + importe + ", num_pasajeros=" + num_pasajeros
					+ ", pasajero=" + pasajero + ", vuelo=" + vuelo + ", pago=" + pago + "]";
		}
		
		
		
		
		
		
		
		
}
