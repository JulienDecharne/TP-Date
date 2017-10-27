package org.hezzel.formation.tp;

import java.util.Scanner ;

public class Launcher
{
	public static void main (String[] args) {
		// Recueillera l'entrée de l'utilisateur
		int input; // Entre 1 et 365 (Exceptions non gérées)
		// L'année est-elle bissextile ?
		boolean isBissextile;
		
		isBissextile = false;
		
		DateResolver resolver = new DateResolver(isBissextile);

		// Objet Scanner pour l'entrée
		Scanner inputScanner = new Scanner(System.in);
		// Entrée de l'utilisateur
		System.out.print("Entrez le jour de l'année : ");
		input = inputScanner.nextInt(); // Exceptions non gérées
		inputScanner.close();


		// Sortie pour l'utilisateur
		System.out.println("              Mois : " + resolver.getMonthName(input));
		System.out.println("Jour de la semaine : " + resolver.getWeekdayName(input));
	}
}
