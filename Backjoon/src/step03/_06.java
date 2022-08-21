package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _06 {
	/* 
	 * 날짜 : 2022/08/20
	 * 이름 : 김지홍
	 * 내용 : A+B - 7 11021
	 */
	public static void main(String[] args) throws IOException {
		int nCount;
		int n1;
		int n2;
		int sum;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		nCount = Integer.parseInt(br.readLine());

		for(int i=1; i<=nCount; i++) {
			String strArray[] = br.readLine().split(" ");
			n1 = Integer.parseInt(strArray[0]);
			n2 = Integer.parseInt(strArray[1]);
			sum = n1+n2;
			bw.write("Case #"+ i + ": " + sum);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
