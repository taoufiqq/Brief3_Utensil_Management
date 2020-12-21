package com.Gestion_Ustensiles.models;



public abstract class Ustensile {

	private int anneeFabrication;

	public int getAnneeFabrication() {
		return anneeFabrication;
	}

	public void setAnneeFabrication(int anneeFabrication) {
		this.anneeFabrication = anneeFabrication;
	}

	public Ustensile(int anneeFabrication) {
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
