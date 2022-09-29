package ch15.stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != -1) {			
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
