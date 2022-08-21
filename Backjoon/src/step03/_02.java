package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _02 {
	/* 
	 * 날짜 : 2022/08/20
	 * 이름 : 김지홍
	 * 내용 : A+B - 3 10950
	 */
	public static void main(String[] args) throws IOException {
		String tData;
		int cData;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		tData = br.readLine();
		cData = Integer.valueOf(tData);
		
		for(int i=0; i<=cData-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int a = Integer.valueOf(st.nextToken());
				sum += a;
			}
			bw.write(String.valueOf(sum));
			sum = 0;
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
