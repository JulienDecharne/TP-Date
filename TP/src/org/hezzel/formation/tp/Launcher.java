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
		int monthsLengths[] = {31,29,31,30,31,30,31,31,30,31,30,31};

		// Index du mois;
		int idMonth = 0;
		// Nombre total de jours pour un mois donné
		int totalDays = 0;

		
		// Recueillera l'entrée de l'utilisateur
		int input; // Entre 1 et 365 (Exceptions non gérées)
		// Les noms du mois et du jour de la semaine
		String monthName;
		String weekDayName;		
		
		
		// Scanner pour l'entrée
		Scanner inputScanner = new Scanner(System.in);
		// Entrée de l'utilisateur
		System.out.print("Entrez le jour de l'année : ");
		input = inputScanner.nextInt(); // Exceptions non gérées
		System.out.println();
		
		
		// Parcours du tableau monthsLengths
		for(int monthLength: monthsLengths)
		{
			// TotalDay est mis à jour dès maintenant
			// Est égal au dernier jour du mois courant
			totalDays = totalDays + monthLength;
			// Si l'entrée est avant la fin du mois courant
			// => On arrête
			if (input <= totalDays) { break; }
			// On incrémente l'index du mois
			// Est égal au mois SUIVANT
			idMonth = idMonth + 1;
		}
		
		// Sortie pour l'utilisateur
		System.out.println("              Mois : " + dateBuilder[0][idMonth]);
		System.out.println("Jour de la semaine : " + dateBuilder[1][(input-1) % 7]);
	}
}
