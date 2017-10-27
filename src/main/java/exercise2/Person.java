package exercise2;

class Person {
	private int m_age;

	private static int popSize = 0;
	private static int sumAge = 0;

	public Person(int p_age) {
		popSize++;
		m_age = p_age;
		sumAge += p_age;
	}

	public static int computePopulationSize(){
		 return popSize;
	}

	public static float computeAveragePopulationAge(){
		return (float)sumAge / popSize;
	}

	public static void resetPopulation() {
		popSize = 0;
		sumAge = 0;
	}
}
