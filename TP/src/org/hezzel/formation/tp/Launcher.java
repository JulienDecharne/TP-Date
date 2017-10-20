package org.hezzel.formation.tp;

import java.util.Scanner ;

public class Launcher
{
	public static void main (String[] args) {
		// Tableau à deux dimensions:
		// * un tableau avec les noms des mois
		// * un tableau avec les noms des jours de la semaine
		String dateBuilder[][] = {
				{ "janvier", "février","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre" }
				,
				{ "lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche" }
		};
		

		// Tableau des durées des mois
		int monthsLengths[] = {31,28,31,30,31,30,31,31,30,31,30,31};


		// Recueillera l'entrée de l'utilisateur
		int input; // Entre 1 et 365 (Exceptions non gérées)
		// L'année est-elle bissextile ?
		boolean isBissextile;
		// Index du mois;
		int idMonth;
		// Nombre total de jours pour un mois donné
		int totalDays;
		
		isBissextile = true;
		if(isBissextile) { monthsLengths[1] = 29; }
		
		// Objet Scanner pour l'entrée
		Scanner inputScanner = new Scanner(System.in);
		// Entrée de l'utilisateur
		System.out.print("Entrez le jour de l'année : ");
		input = inputScanner.nextInt(); // Exceptions non gérées
		inputScanner.close();


		// Parcours du tableau monthsLengths
		for(idMonth = 0, totalDays = 0; idMonth < monthsLengths.length; idMonth++)
		{
			// TotalDay est mis à jour dès maintenant
			// Est égal au dernier jour du mois courant
			totalDays = totalDays + monthsLengths[idMonth];
			// Si l'entrée est avant la fin du mois courant
			// => On arrête
			if (input <= totalDays) { break; }
		}
		
		// Sortie pour l'utilisateur
		System.out.println("              Mois : " + dateBuilder[0][idMonth]);
		System.out.println("Jour de la semaine : " + dateBuilder[1][(input-1) % 7]);
	}
}
