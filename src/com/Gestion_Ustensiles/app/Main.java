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
			    System.out.println("1- Ajouter Cuillère");
		        System.out.println("2- Afficher Cuillère");
		        System.out.println("3- Quitter le Menu Cuillère");
		        
		        System.out.println("Choix :");
		        
		        int choixCuillère = scanner.nextInt();
		        switch (choixCuillère) {
				case 1:
					 
					 System.out.println("Ajouter Cuillère");
					 
					 System.out.println("ID :");
					 int id = scanner.nextInt ();	
					 					 
					 System.out.println("longuer :");
					 Double longueur = scanner.nextDouble();					  
					 
					
						
						UstensileController us = new UstensileController();
						us.ajouterCuillière(id, longueur);
					 
					 System.out.println("Cuillère Bien Ajouté");
					 
					
					break;
				case 2:
					 System.out.println("Afficher la list des Cuillères");
					 
					  UstensileController uc = new UstensileController();
					  uc.afficherCuilleres();
					break;
					
					
				 case 3:
                 	System.out.println("Vous avez Quitter le Menu des Cuillères");
              
                 	var=true;

                     break;

					default:
						System.out.println("Choix invalid!!!!!!!!!!!");
						break;
				}
		        
		        }

	}

}
