package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _12 {
	/*
	 * 날짜 : 2022/08/19
	 * 이름 : 김지홍
	 * 내용 : 곱셈 2588
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int b = (y / 10 % 10) * x;
		int c = y / 100 * x;

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(y % 10 * x)); // 1의 자리 
		bw.newLine();
		
		bw.write(b+""); // 10의 자리
		bw.newLine();
		
		bw.write(c+""); // 100의 자리
		bw.newLine();
		
		bw.write(String.valueOf(x * y)); // 곱셈
		
		bw.flush();
		bw.close();
	}
}
