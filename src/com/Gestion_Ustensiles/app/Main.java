package com.Gestion_Ustensiles.app;

import java.sql.SQLException;
import java.util.Scanner;


import com.Gestion_Ustensiles.controllers.UstensileController;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
			boolean var = true;
			while (var) {
				
				System.out.println("*********************Gestion des Ustensiles*********************");
			    System.out.println("1- Ajouter Cuill�re");
		        System.out.println("2- Afficher Cuill�re");
		        System.out.println("3- Quitter le Menu Cuill�re");
		        
		        System.out.println("Choix :");
		        
		        int choixCuill�re = scanner.nextInt();
		        switch (choixCuill�re) {
				case 1:
					 
					 System.out.println("Ajouter Cuill�re");
					 
					 System.out.println("ID :");
					 int id = scanner.nextInt ();	
					 					 
					 System.out.println("longuer :");
					 Double longueur = scanner.nextDouble();					  
					 
					
						
						UstensileController us = new UstensileController();
						us.ajouterCuilli�re(id, longueur);
					 
					 System.out.println("Cuill�re Bien Ajout�");
					 
					
					break;
				case 2:
					 System.out.println("Afficher la list des Cuill�res");
					 
					  UstensileController uc = new UstensileController();
					  uc.afficherCuilleres();
					break;
					
					
				 case 3:
                 	System.out.println("Vous avez Quitter le Menu des Cuill�res");
              
                 	var=true;

                     break;

					default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
				}
		        
		        }

	}

}
