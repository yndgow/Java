package step05;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김지홍
 * 내용 : 셀프 넘버 4673
 */

public class Test2 {

	void selfNum() {
		boolean [] arr = new boolean [10001];
		
		
		
		int x = 0;;
		int y = 0;
		int sum = x;
		
		for(int i=0; i<arr.length; i++) {
			while(i>0) {
				x = i % 10; // 1 의 자리

				sum += x;
				
				i = x / 10;
			}
		}
		
		
		
	}
}
