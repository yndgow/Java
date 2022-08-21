package step02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/20
 * 이름 : 김지홍
 * 내용 : 윤년 2753
 */
public class _03 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.valueOf(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(year % 4 == 0 && year % 100 != 0) {
			bw.write("1");
		}else if(year % 400 == 0) {
			bw.write("1");
		}else {
			bw.write("0");
		}
			
		bw.flush();
		bw.close();
	}
}