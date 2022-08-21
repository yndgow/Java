package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _04 {

	public static void main(String[] args) throws IOException {
		int fCost;
		int nCount;
		int aCount;
		int aCost;
		int sum;
		int fSum = 0;
		String result;
		String[] a;
		List<Integer> list= new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		fCost = Integer.valueOf(br.readLine());
		nCount = Integer.valueOf(br.readLine());

		for(int i=0; i<=nCount-1; i++) {
			a = br.readLine().split(" ");
			aCount = Integer.valueOf(a[0]);
			aCost = Integer.valueOf(a[1]);
			sum = aCost * aCount;
			list.add(sum);
		}
		br.close();
		
		for(int j : list) {
			fSum += j;
		}
		
		result = (fCost == fSum) ? "Yes" : "No";
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
