package com.Gestion_Ustensiles.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Gestion_Ustensiles.config.Configuration;

public class UstensileController {

	Configuration config;
	
	public UstensileController() {
		
		config = new Configuration("jdbc:mysql://localhost:3306/gestion_ustensiles", "root", "");
	}
	public void ajouterCuillière(int idCuillere, double longueur) throws SQLException {
		
		String query = " insert into cuillere (idCuillere, longueur)" + " values (?, ?)";
		Connection conn = config.connect();
		
	    PreparedStatement preparedStmt = conn.prepareStatement(query);
		
		preparedStmt.setLong(1, idCuillere);
		preparedStmt.setDouble(2, longueur );
	
		preparedStmt.execute();
		
	}
    public void afficherCuilleres () throws SQLException {
		
		String sql = "select * from cuillere";
		
		Connection conn = config.connect();
		
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 System.out.println("----------------------------------");
	     System.out.printf("%10s %15s\n", "idCuillere", "longueur en cm");
	     System.out.println("----------------------------------");
		 while(result.next()) {
			int idCuillere = result.getInt("idCuillere");
	        Double longueur = result.getDouble("longueur");
	        
	        System.out.format("%10s %15s\n", idCuillere, longueur);
	        System.out.println("----------------------------------");
	       
		}

	}
	
}
