package step05;

/*
 * 날짜 : 2022/08/30
 * 이름 : 김지홍
 * 내용 : 정수 N개의 합 15596
 */

public class Test {
	
	long sum(int [] a) {
		long ans = 0;
		
		for(int i=0; i<a.length; i++) {
		ans += a[i];
		}
		return ans;
	}
}

