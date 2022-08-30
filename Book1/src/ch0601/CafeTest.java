package ch0601;

public class CafeTest {
	public static void main(String[] args) {
		Person kim = new Person(10000);
		Person lee = new Person(6000);
		
		kim.drink(StarCafe.getAmericano());
		lee.drink(BeanCafe.getLatte());
		
		System.out.println(kim.getMoney());
		System.out.println(lee.getMoney());
	}
}
