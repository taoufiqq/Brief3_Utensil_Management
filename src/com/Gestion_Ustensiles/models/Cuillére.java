package com.Gestion_Ustensiles.models;



public class Cuill�re extends Ustensile{

	private int idCuillere;
	private double longueur;
	
	public int getIdCuill�re() {
		return idCuillere;
	}
	public void setIdCuill�re(int idCuillere) {
		this.idCuillere = idCuillere;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public Cuill�re() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuill�re(int anneeFabrication,int idCuillere,double longueur) {
		super(anneeFabrication);
		this.idCuillere = idCuillere;
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}

	public Cuill�re(long long1, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidCuill�re=" + idCuillere + "\nlongueur=" + longueur 
				+ super.toString();
	}
	
	
	
}
