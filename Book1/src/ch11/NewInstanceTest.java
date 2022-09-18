package ch11;

class Mydog{
	String name;
	String type;
	
	public Mydog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type+ " " + name;
	}
}


public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("ch11.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
		Mydog dog = new Mydog("멍멍이", "진돗개");
		System.out.println(dog);
		
	}
}
