package ch04;

public class p123 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		if(operator == '+') {
			System.out.println(num1 + num2); 
		}else if(operator == '-'){
			System.out.println(num1 - num2);
		}else if(operator == '*') {
			System.out.println(num1 * num2);
		}else if(operator == '/') {
			System.out.println(num1 / num2);
		}
		
		for(int i=2; i<=9; i++) {
			if(i % 2 != 0) continue;
			for(int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " +(i * j));
			}
		}
		int a = 2;
		int b = 1;
		for(a=2; a<=9; a++) {
			for(b=1; b<=9; b++) {
				System.out.println(a + " X " + b + " = " +(a * b));
				if(a <= b) break;
			}
		}
		int xx, yy, zz;
		zz = 3;
		for(yy=0; yy<=zz; yy++) {
			for(xx=1; xx<=zz-yy; xx++) {
				System.out.print(" ");
			}
			for(xx=0; xx<=yy*2; xx++) {
				System.out.print("*");
			}
			System.out.println();
//			if(yy==zz) {
//				for() {
//					
//				}
//			}
		}
	}
}
