package com.Gestion_Ustensiles.models;

import java.util.Date;

public class AssietteRonde extends Assiette{
	
	
	private int idAssietteRonde;
	private double rayon;
	
	public int getIdAssietteRonde() {
		return idAssietteRonde;
	}
	public void setIdAssietteRonde(int idAssietteRonde) {
		this.idAssietteRonde = idAssietteRonde;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public AssietteRonde() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssietteRonde(Date anneeFabrication,int idAssietteRonde,double rayon) {
		super(anneeFabrication);
		this.idAssietteRonde = idAssietteRonde;
		this.rayon = rayon;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\\nidAssietteRonde:" + idAssietteRonde + "\nrayon:" + rayon
				+ super.toString();
	}
	
	
}
