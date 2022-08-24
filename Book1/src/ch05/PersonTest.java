package ch05;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.age = 40;
		person1.name = "James";
		person1.isMarried = true;
		person1.children = 3;
		
		System.out.println("나이는 " + person1.getAge() + "살 입니다.");
		System.out.println("이름은 " + person1.getName() + "입니다.");
		System.out.println("결혼여부는 " + person1.isMarried() + "입니다.");
		System.out.println("자녀의 수는 " + person1.getChildren() + "명 입니다.");
		
		
	}

}
