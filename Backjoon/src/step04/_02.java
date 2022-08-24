package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 날짜 : 2022/08/23
 * 이름 : 김지홍
 * 내용 : 최댓값 2562
 */


public class _02 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer [] arr = new Integer [9];
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int max = arr[0];
		for(int j=1; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
		}
		int index = Arrays.asList(arr).indexOf(max);
		
		bw.write(max+"");
		bw.newLine();
		bw.write(index+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
