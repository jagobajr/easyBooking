package es.deusto.ingenieria.sd.auctions.server.data.dto;

import java.io.Serializable;

public class AerolineaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long number;
	private String title;
	private float actualPrice;
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
		
	public float getActualPrice() {
		return actualPrice;
	}
	
	public void setActualPrice(float actualPrice) {
		this.actualPrice = actualPrice;
	}
}