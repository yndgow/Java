package step06;

import java.util.ArrayList;

/*
 * 날짜 : 2022/09/06
 * 이름 : 김지홍
 * 내용 : 단어 공부 1157
 */

public class _05 {
	public static void main(String[] args) {
		String a1 = "Mississipi";
		String a2 = a1.toUpperCase();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<a1.length(); i++) {
			int n = 0;
			for(int j=0; j<a1.length(); j++) {
				if(a2.charAt(i)  == a2.charAt(j)) {
					n++;
				}
			}
			list.add(i, n);
		}
		
		for (Integer i : list) {
			System.out.print(i);
		}
	}
}
