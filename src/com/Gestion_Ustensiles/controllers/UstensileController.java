package com.Gestion_Ustensiles.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Gestion_Ustensiles.config.Configuration;
import com.Gestion_Ustensiles.models.AssietteCarree;
import com.Gestion_Ustensiles.models.AssietteRonde;
import com.Gestion_Ustensiles.models.Cuillére;


public class UstensileController {

	Configuration config;
	
	public UstensileController() {
		
		config = new Configuration("jdbc:mysql://localhost:3306/gestion_ustensiles", "root", "");
	}
//	---------------------------------------la partie des Cuilleres------------------------------------------
	
	public void ajouterCuillière(int idCuillere, double longueur,int anneeFabrication) throws SQLException {
		
		String query = " insert into cuillere (idCuillere, longueur, anneeFabrication)" + " values (?, ?, ?)";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
		
		preparedStmt.setLong(1, idCuillere);
		preparedStmt.setDouble(2, longueur );
		preparedStmt.setInt(3, anneeFabrication );
		preparedStmt.execute();
		
	}
    public ArrayList<Cuillére> afficherCuilleres () throws SQLException {
    	
		ArrayList<Cuillére> listCuillere = new ArrayList<Cuillére>();
    	
		String sql = "select * from cuillere";
		
		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		 while(result.next()) {
			 listCuillere.add(new Cuillére(result.getLong("idCuillere"),result.getString("longueur"),result.getString("anneeFabrication")));
		        }
		 return listCuillere;

	       
		}
    
    public int calculerValeurCuillere(int anneeActuelle) throws SQLException {
    	
	    String sql = "select * from cuillere";
//	    ArrayList<Integer> listAn = new ArrayList<Integer>();
		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 int valeur = 0;
		while(result.next()) {
			 

			int anneeF = result.getInt("anneeFabrication");
			int age = (anneeActuelle - anneeF);
		
	      
	        if (age > 50) {
	            valeur += age - 50;
	        }
	        

    }
		return valeur;


    } 
    
    public void updateCuillere(int id, int anneeFabrication) throws SQLException {
    	
    	String query = "UPDATE cuillere SET anneeFabrication = '"+anneeFabrication+"' WHERE idCuillere ='" + id + "'";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
	    preparedStmt.executeUpdate();
    }
//	---------------------------------------la partie des Assiette-----------------------------------------
    
//	------------------------------------la partie des AssietteCarree------------------------
	public void ajouterAssietteCarree(int idAssietteCarree, double cote) throws SQLException {
		
		String query = " insert into assiette_carree (idAssietteCarree, cote)" + " values (?, ?)";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
		
		preparedStmt.setLong(1, idAssietteCarree);
		preparedStmt.setDouble(2, cote );
	
		preparedStmt.execute();
		
	}
    
 public double CalculSurfaceAssietteCarree () throws SQLException {
    	
    	
		String sql = "select * from assiette_carree";
		
		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		double somme = 0;
		 while(result.next()) {
			 somme +=  (result.getLong("cote")*result.getLong("cote"));
		 }
		  return somme;
    
		}
 

 public int calculerValeurAssietteCarree(int anneeActuelle) throws SQLException {
	 	
	    String sql = "select * from assiette_carree";

		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		  int valeur = 0;
		while(result.next()) {
		

			int anneeF = result.getInt("anneeFabrication");
			int age = (anneeActuelle - anneeF);
		
	      
	        if (age > 50) {
	            valeur += (age - 50) *5 ;
	        }
	        

}
		return valeur;


}
 
 public void updateAssietteCarree(int id, int anneeFabrication) throws SQLException {
 	
 	String query = "UPDATE assiette_carree SET anneeFabrication = '"+anneeFabrication+"' WHERE idAssietteCarree ='" + id + "'";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
	    preparedStmt.executeUpdate();
 }
//	------------------------------------la partie des AssietteRonde------------------------
	public void ajouterAssietteRonde(int idAssietteRonde , double rayon) throws SQLException {
		
		String query = " insert into assiette_ronde (idAssietteRonde , rayon)" + " values (?, ?)";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
		
		preparedStmt.setLong(1, idAssietteRonde );
		preparedStmt.setDouble(2, rayon );
	
		preparedStmt.execute();
		
	}
    
 public double CalculSurfaceAssietteRonde () throws SQLException {
    	
    	
		String sql = "select * from assiette_ronde";
		
		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		double somme = 0;
		 while(result.next()) {
			 somme += 3.14 * (result.getLong("rayon")*result.getLong("rayon"));
		 }
		  return somme;
    
		}

 
 public int calculerValeurAssietteRonde(int anneeActuelle) throws SQLException {
 	
	    String sql = "select * from assiette_ronde";
//	    ArrayList<Integer> listAn = new ArrayList<Integer>();
		Connection conn = config.connect();
		 int valeur = 0;
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			 

			int anneeF = result.getInt("anneeFabrication");
			int age = (anneeActuelle - anneeF);
		
	      
	        if (age > 50) {
	            valeur += age - 50;
	        }
	        

 }
		return valeur;


 }
 public void updateAssietteRonde(int id, int anneeFabrication) throws SQLException {
	 	
	 	String query = "UPDATE assiette_ronde SET anneeFabrication = '"+anneeFabrication+"' WHERE idAssietteRonde ='" + id + "'";
			Connection conn = config.connect();
			
		    PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.executeUpdate();
	 }
 public int valeurTotal() throws SQLException {
	return calculerValeurAssietteCarree(2020)+calculerValeurAssietteRonde(2020)+calculerValeurCuillere(2020);
	 
 }

}
	

