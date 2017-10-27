package exercise1;

class Person {
	private String m_name;
	private int m_age;

	public Person(String n, int a){
		m_name = n;
		m_age = a;
	}

	public String getName(){
		return m_name;
	}

	public int getAge(){
		return m_age;
	}
}
