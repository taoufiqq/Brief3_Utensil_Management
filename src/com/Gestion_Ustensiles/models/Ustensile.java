package com.Gestion_Ustensiles.models;

import java.util.Date;

public class Ustensile {

	private Date anneeFabrication;

	public Date getAnneeFabrication() {
		return anneeFabrication;
	}

	public void setAnneeFabrication(Date anneeFabrication) {
		this.anneeFabrication = anneeFabrication;
	}

	public Ustensile(Date anneeFabrication) {
		super();
		this.anneeFabrication = anneeFabrication;
	}
	
	public Ustensile() {
		
	}

	@Override
	public String toString() {
		return "anneeFabrication:" + anneeFabrication ;
	}
}
