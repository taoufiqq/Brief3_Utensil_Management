package com.Gestion_Ustensiles.models;

import java.util.Date;

public class Cuill�re extends Ustensile{

	private int idCuill�re;
	private double longueur;
	
	public int getIdCuill�re() {
		return idCuill�re;
	}
	public void setIdCuill�re(int idCuill�re) {
		this.idCuill�re = idCuill�re;
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
	public Cuill�re(Date anneeFabrication,int idCuill�re,double longueur) {
		super(anneeFabrication);
		this.idCuill�re = idCuill�re;
		this.longueur = longueur;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidCuill�re=" + idCuill�re + "\nlongueur=" + longueur 
				+ super.toString();
	}
	
	
	
}
