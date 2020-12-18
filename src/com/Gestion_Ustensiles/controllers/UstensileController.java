package com.Gestion_Ustensiles.controllers;

import com.Gestion_Ustensiles.config.Configuration;

public class UstensileController {

	Configuration config;
	
	public UstensileController() {
		
		config = new Configuration("jdbc:mysql://localhost:3306/gestion_ustensiles", "root", "");
	}
}
