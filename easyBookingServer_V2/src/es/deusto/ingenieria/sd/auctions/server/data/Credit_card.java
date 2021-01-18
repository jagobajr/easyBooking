package es.deusto.ingenieria.sd.auctions.server.data;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Credit_card extends Metodo_pago{
	private int numeroTrajeta;
	private String titular;
	private int cvv;
	
	public Credit_card(int numeroTrajeta, String titular, int cvv) {
		super();
		this.numeroTrajeta = numeroTrajeta;
		this.titular = titular;
		this.cvv = cvv;
	}

	public int getNumeroTrajeta() {
		return numeroTrajeta;
	}

	public void setNumeroTrajeta(int numeroTrajeta) {
		this.numeroTrajeta = numeroTrajeta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Credit_card [numeroTrajeta=" + numeroTrajeta + ", titular=" + titular + ", cvv=" + cvv + "]";
	}
	
	
	
	

}
