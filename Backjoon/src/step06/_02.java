package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2022/09/05
 * 이름 : 김지홍
 * 내용 : 숫자의 합 11720
 */
public class _02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count =  Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		
		for (int i=0; i<count; i++) {
			sum += str.charAt(i) - 48; // 문자1 이 49 이므로 -48로 값을 맞춰줌
		}
		System.out.println(sum);
		br.close();
	}

}
