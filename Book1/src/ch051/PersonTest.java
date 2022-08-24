package ch051;

public class PersonTest {

	public static void main(String[] args) {
		Person personPark = new Person("박명수", 172.2f, 64.4f);
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.5f;
		personKim.height = 180.0f;
		
		Person personLee = new Person("이순신", 175.5f, 75.2f);
	}

}
