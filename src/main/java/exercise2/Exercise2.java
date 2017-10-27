package exercise2;

public class Exercise2 {

	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.

	static Person createPerson(int age) {
		return new Person(age);
	}

	static int computePopulationSize() {
		return Person.computePopulationSize();
	}

	static float computeAveragePopulationAge() {
		return Person.computeAveragePopulationAge();
	}

	static void resetPopulation() {
		Person.resetPopulation();
	}
}
