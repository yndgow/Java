package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _01 {
	/* 
	 * 날짜 : 2022/08/22
	 * 이름 : 김지홍
	 * 내용 : 최소, 최대 10818
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int nCount;
		String str;
		int nNum;
		
		// 횟수 입력
		nCount = Integer.parseInt(br.readLine());
		
		// 배열 생성
		int [] array = new int [nCount];
		str = br.readLine();
		st =  new StringTokenizer(str, " ");
		
		if(nCount != 1) {
			
			// 입력 받은 숫자 배열 저장
			for(int i=0; i<nCount; i++) {
				nNum = Integer.parseInt(st.nextToken());
				array[i] = nNum;
			}
			
			// 최소값
			int min = array[0];
			for(int k=1; k<=nCount; k++) {
				if(min > array[k]) {
					min = array[k];
				}
			}
			
			//최소값 입력
			bw.write(min+" ");

			// 최대값
			int max = array[0]; 
			for(int j=1; j<=nCount; j++) {
				if(max < array[j]) {
					max = array[j];
				}
			}
			
			// 최대값 입력
			bw.write(max+"");
			
			br.close();
			bw.flush();
			bw.close();

		}else {
			bw.write(str + " " + str);
			br.close();
			bw.flush();
			bw.close();	
		}
	}
}
