package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/19
 * 이름 : 김지홍
 * 내용 : 상수 2908
 */

public class _07 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
		String s = "734 893";
		String [] strArr = s.split(" "); // split 으로 잘라서 배열에 넣기
		
		char a1 = strArr[0].charAt(0);
		char a3 = strArr[0].charAt(2);
		
		strArr[0].replace(a1, a3);
		strArr[0].replace(a3, a1);
		System.out.println(strArr[0]);
		System.out.println(a1);
		System.out.println(a3);
		 
		
		
		
		
//		br.close();
	}
}
