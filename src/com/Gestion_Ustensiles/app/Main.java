package com.Gestion_Ustensiles.app;

import java.sql.SQLException;

import com.Gestion_Ustensiles.config.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration("jdbc:mysql://localhost:3306/gestion_ustensiles", "root", "");
		try {
			config.connect();
			System.out.println("connect successfully :)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
