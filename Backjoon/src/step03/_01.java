package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _01 {
	/* 
	 * 날짜 : 2022/08/20
	 * 이름 : 김지홍
	 * 내용 : 구구단 2739
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipData = br.readLine();
		br.close();
		
		int cData = Integer.valueOf(ipData);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1; i<=9; i++) {
			bw.write(ipData);
			bw.write(" * ");
			bw.write(String.valueOf(i));
			bw.write(" = ");
			bw.write(String.valueOf(cData * i + "\n"));
		}
		bw.flush();
		bw.close();
	}
}
