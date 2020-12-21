package com.Gestion_Ustensiles.models;



public class AssietteCarree extends Assiette{
	
	private int idAssietteCarree;
	private double cote;
	public int getIdAssietteCarree() {
		return idAssietteCarree;
	}
	public void setIdAssietteCarree(int idAssietteCarree) {
		this.idAssietteCarree = idAssietteCarree;
	}
	public double getCote() {
		return cote;
	}
	public void setCote(double cote) {
		this.cote = cote;
	}
	public AssietteCarree() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssietteCarree(int anneeFabrication,int idAssietteCarree,double cote) {
		super(anneeFabrication);
		this.idAssietteCarree = idAssietteCarree;
		this.cote = cote;
		// TODO Auto-generated constructor stub
	}
	public AssietteCarree(long long1,long long2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nidAssietteCarree=" + idAssietteCarree + "\ncote=" + cote 
				+ super.toString();
	}

	
	
}
