package msub01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		int nCount;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		nCount = Integer.parseInt(br.readLine());

		for(int i=1; i<=nCount; i++) {
			for(int j=1; j<=nCount-i; j++) {
				bw.write(" ");
			}
			for(int k=1; k<=i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
