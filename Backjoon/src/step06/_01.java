package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 아스키코드 11654
 */
public class _01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =  br.readLine();
		char a = str.charAt(0); // String char 형 변환
		System.out.println((int)a); // char int 형 변환
		br.close();
	}

}
