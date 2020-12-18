package com.Gestion_Ustensiles.models;

import java.util.Date;

public class Cuillére extends Ustensile{

	private int idCuillère;
	private double longueur;
	
	public int getIdCuillère() {
		return idCuillère;
	}
	public void setIdCuillére(int idCuillère) {
		this.idCuillère = idCuillère;
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
	public Cuillére(Date anneeFabrication,int idCuillère,double longueur) {
		super(anneeFabrication);
		this.idCuillère = idCuillère;
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidCuillère=" + idCuillère + "\nlongueur=" + longueur 
				+ super.toString();
	}
	
	
	
}
