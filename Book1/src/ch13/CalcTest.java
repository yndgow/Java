package ch13;

public class CalcTest {
	public static void main(String[] args) {
		Calc cal = (a, b) -> a+b;
		System.out.println(cal.add(1, 2));
	}
	
}
