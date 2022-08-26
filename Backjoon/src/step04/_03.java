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
 * 주소 : https://www.acmicpc.net/problem/3052
 * 풀이참조 : 0301 0302
 */


public class _03 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = 10;
		int arr [] = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i]= Integer.parseInt(br.readLine()) % 42;
		}
//		System.out.println(arr.length); 
		for(int j=0; j<arr.length; j++) {
			for(int k=0; k<arr.length; k++) {
				if(arr[j]==arr[k] && j<k) {
					num -= 1;
				}
			}
		}
		
		bw.write(num + "");
		bw.flush();
		br.close();
		bw.close();
	}

}
