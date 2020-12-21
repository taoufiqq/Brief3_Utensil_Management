package com.Gestion_Ustensiles.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import com.Gestion_Ustensiles.controllers.UstensileController;
import com.Gestion_Ustensiles.models.Cuillére;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		  boolean var = true;
			
			while (var) {
				
				System.out.println("*********************Bienvenu dans la Gestion_Ustensiles*********************");
		        System.out.println("Menu Principal");
		        System.out.println("1- Gestion des Cuillère");
		        System.out.println("2- Gestion Assiette");
		        System.out.println("3- Valeur Total des Ustensiles");
		        System.out.println("4- Quitter le programme");
		        
		        System.out.println("Choix :");
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        int choix = scanner.nextInt();
		        switch (choix) {
				case 1:
					boolean var1 = true;
					while (var1) {
						
						System.out.println("*********************Gestion des Cuillère*********************");
					    System.out.println("1- Ajouter Cuillère");
				        System.out.println("2- Afficher Cuillère");
				        System.out.println("3- Modifier Cuillère");
				        System.out.println("4- Quitter le Menu Cuillère");
				        
				        System.out.println("Choix :");
				        
				        int choixCuillère = scanner.nextInt();
				        switch (choixCuillère) {
						case 1:
							 
							 System.out.println("Ajouter Cuillère");
							 
							 System.out.println("ID :");
							 int id = scanner.nextInt ();	
							 					 
							 System.out.println("longuer :");
							 Double longueur = scanner.nextDouble();
							 
							 System.out.println("annee de fabrication:");
							 int anneeFab = scanner.nextInt();
							 
							
								
								UstensileController us = new UstensileController();
								us.ajouterCuillière(id, longueur,anneeFab);
							 
							    System.out.println("Cuillère Bien Ajouté");
							 
							
							break;
						case 2:
							 System.out.println("le nombre d'objets de type Cuillere :");
							  UstensileController uc = new UstensileController();
							  System.out.println(uc.afficherCuilleres().size());
							
							break;
							
						case 3:
							 
							 System.out.println("Modifier Cuillère");
							 
							 System.out.println("ID :");
							 int idUpdate = scanner.nextInt ();	
							 
							 System.out.println("Entrer Nouveau Annee:");
							 int newAnneeFab = scanner.nextInt();
							 
							 UstensileController update = new UstensileController();
							 update.updateCuillere(idUpdate, newAnneeFab);
							 
							 System.out.println("Cuillère Bien Modifier");
							 
							break;
						 case 4:
						 	System.out.println("Vous avez Quitter le Menu des Cuillères");
		                 	var1=false;  
		                    var=true;
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
						}
				        
				        }
				  break;
				case 2:
					boolean var2 = true;
					while (var2) {
						
						System.out.println("*********************Gestion des Assiette*********************");
					    System.out.println("1- Ajouter AssietteCarree");
					    System.out.println("2- Modifier AssietteCarree");
				        System.out.println("3- Afficher Surface AssietteCarree");
				        System.out.println("4- Ajouter AssietteRonde");
				        System.out.println("5- Modifier AssietteRonde");
				        System.out.println("6- Afficher Surface AssietteRonde");
				        System.out.println("7- Afficher Surface Total des Assiettes");
				        System.out.println("8- Quitter le Menu des Assiettes");
				        
				        System.out.println("Choix :");
				        
				        int choixCuillère = scanner.nextInt();
				        switch (choixCuillère) {
						case 1:
							 
							 System.out.println("Ajouter AssietteCarree");
							 
							 System.out.println("ID :");
							 int idAssietteCarree = scanner.nextInt ();	
							 					 
							 System.out.println("cote :");
							 Double cote = scanner.nextDouble();					  
							 
							
								
								UstensileController usAssietteCarree = new UstensileController();
								usAssietteCarree.ajouterAssietteCarree(idAssietteCarree, cote);
							 
							 System.out.println("AssietteCarree Bien Ajouté");
							 
							
							break;
						case 2:
	                         System.out.println("Modifier AssietteCarree");
							 
							 System.out.println("ID :");
							 int idUpdate = scanner.nextInt ();	
							 
							 System.out.println("Entrer Nouveau Annee:");
							 int newAnneeFab = scanner.nextInt();
							 
							 UstensileController update = new UstensileController();
							 update.updateAssietteCarree(idUpdate, newAnneeFab);
							 
							 System.out.println("AssietteCarree Bien Modifier");
							break;
						case 3:
							 System.out.println("la surface des AssietteCarree :"); 
							 UstensileController uAssietteCarree = new UstensileController();
							 System.out.println(uAssietteCarree.CalculSurfaceAssietteCarree());
							break;
						case 4:
                                 System.out.println("Ajouter AssietteRonde");
							 
							 System.out.println("ID :");
							 int idAssietteRonde = scanner.nextInt ();	
							 					 
							 System.out.println("cote :");
							 Double rayon = scanner.nextDouble();					  
							 
							
								
								UstensileController usAssietteRonde = new UstensileController();
								usAssietteRonde.ajouterAssietteRonde(idAssietteRonde, rayon);
							 
							 System.out.println("AssietteRonde Bien Ajouté");
							break;
						case 5:
							   System.out.println("Modifier AssietteRonde");
								 
								 System.out.println("ID :");
								 int idUpdate1 = scanner.nextInt ();	
								 
								 System.out.println("Entrer Nouveau Annee:");
								 int newAnneeFabr = scanner.nextInt();
								 
								 UstensileController updateA = new UstensileController();
								 updateA.updateAssietteRonde(idUpdate1, newAnneeFabr);
								 
								 System.out.println("AssietteRonde Bien Modifier");
							break;
						case 6:
							 System.out.println("la surface des AssietteRonde :"); 
							 UstensileController uAssietteRonde = new UstensileController();
							 System.out.println(uAssietteRonde.CalculSurfaceAssietteRonde());
							break;
						case 7:
							 System.out.println("la surface total des Assiettes :"); 
							 UstensileController surfaceTotal = new UstensileController();
							 System.out.println(surfaceTotal.CalculSurfaceAssietteRonde() + surfaceTotal.CalculSurfaceAssietteCarree());
							break;
                        case 8:							 
		                 	System.out.println("Vous avez Quitter le Menu des AssietteCarree");
		                    var2=false;
		                    var=true;
		                 	break;
		
							default:
								System.out.println("Choix invalid!!!!!!!!!!!");
								break;
						}
				        
				        }
					break;
				case 3:
				      UstensileController u = new UstensileController();
					  System.out.println(" la somme des valeurs de tous les ustensiles stockés dans le tableau est : "+
					  u.valeurTotal() + " DH"); 
					break;
			
				case 4:
					 System.out.println("Vous avez Quitter le Programme");
                 	var=true;
					break;
				default:
					System.out.println("Choix invalid!!!!!!!!!!!");
					break;
		
				
			}
			}
	        
		

	}

}
