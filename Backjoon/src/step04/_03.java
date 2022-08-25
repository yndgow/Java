package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/08/24
 * 이름 : 김지홍
 * 내용 : 나머지 3052
 */


public class _03 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = 1;
		int arr [] = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i]= Integer.parseInt(br.readLine()) % 42;
		}
//		System.out.println(arr.length); 
		for(int j=0; j<arr.length-1; j++) {
			for(int k=0; k<arr.length-1; k++) {
				if(arr[j]==arr[k] && j<k) {
					num += 1;
				}
			}
		}
		bw.write(num + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
