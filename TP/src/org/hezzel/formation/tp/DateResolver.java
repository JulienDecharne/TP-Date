package org.hezzel.formation.tp;

public class DateResolver
{
	// Tableau à deux dimensions:
	// * un tableau avec les noms des mois
	// * un tableau avec les noms des jours de la semaine
	final private static String dateBuilder[][] = {
			{ "janvier", "février","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","décembre" }
			,
			{ "lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche" }
	};
	
	// Tableau des durées des mois
	final private static int monthsLengths[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	private boolean bissextile;
	
	public DateResolver(boolean bissextile)
	{
		this.bissextile = bissextile;
	}
	
	public String getMonthName(int day)
	{
		int idMonth,totalDays;
		// Parcours du tableau monthsLengths
		for(idMonth = 0, totalDays = 0; idMonth < monthsLengths.length; idMonth++)
		{
			// TotalDay est mis à jour dès maintenant
			// Est égal au dernier jour du mois courant
			totalDays = totalDays + monthsLengths[idMonth];
			
			if(this.bissextile && (idMonth == 1) ) { totalDays++; }
			
			// Si l'entrée est avant la fin du mois courant
			// => On arrête
			if (day <= totalDays) { break; }
		}
	
		return dateBuilder[0][idMonth];
	
	}
	
	public String getWeekdayName(int day)
	{
		return dateBuilder[1][(day-1) % 7];
	}
}
