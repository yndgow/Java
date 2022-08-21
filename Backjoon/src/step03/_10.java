package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10 {
	/* 
	 * 날짜 : 2022/08/20
	 * 이름 : 김지홍
	 * 내용 : x보다 작은 수 10871
	 */
	public static void main(String[] args) throws IOException {
		int nCount;
		int sNum;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		nCount = Integer.parseInt(st.nextToken());
		sNum = Integer.parseInt(st.nextToken());
		
		String[] inputArray = br.readLine().split(" ");
		
		for(int i=0; i<nCount; i++) {
			if(Integer.parseInt(inputArray[i]) < sNum) {
				bw.write(inputArray[i]);
				bw.write(" ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
