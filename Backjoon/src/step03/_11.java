package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11 {
	/* 
	 * 날짜 : 2022/08/21
	 * 이름 : 김지홍
	 * 내용 : A+B - 5 10952
	 */
	public static void main(String[] args) throws IOException {
		int num1 = 0;
		int num2;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			
			if(num1 == 0 && num2 == 0) {
				break;
			}else if(num1 != 0 && num2 != 0) {
				bw.write(num1 + num2 + "");
				bw.newLine();
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
