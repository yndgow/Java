package ch15.stream.others;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름:");
		String name = scanner.nextLine();
		System.out.print("직업:");
		String job = scanner.nextLine();
		System.out.print("사번:");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
		
		scanner.close(); 
		
		
	}
}
