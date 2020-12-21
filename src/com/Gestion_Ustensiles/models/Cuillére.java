package com.Gestion_Ustensiles.models;



public class Cuillére extends Ustensile{

	private int idCuillere;
	private double longueur;
	
	public int getIdCuillère() {
		return idCuillere;
	}
	public void setIdCuillére(int idCuillere) {
		this.idCuillere = idCuillere;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public Cuillére() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuillére(int anneeFabrication,int idCuillere,double longueur) {
		super(anneeFabrication);
		this.idCuillere = idCuillere;
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}

	public Cuillére(long long1, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidCuillère=" + idCuillere + "\nlongueur=" + longueur 
				+ super.toString();
	}
	
	
	
}
