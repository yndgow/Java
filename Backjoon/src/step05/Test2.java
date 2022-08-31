package step05;

/*
 * 날짜 : 2022/08/31
 * 이름 : 김지홍
 * 내용 : 셀프 넘버 4673
 */

public class Test2 {
	public static void main(String[] args) {
		selfNum();
	}
	static void selfNum() {
		boolean [] arr = new boolean [10001];
		
		for(int i=1; i<arr.length; i++) {
			int x = i;
			int y = 0;
			int sum = 0;
			sum += i;
			
			while(x>0) {
				y = x % 10; // 1 의 자리

				sum += y;
				
				x = x / 10;
			}
			if(sum<=10000) arr[sum] = true;
		}
		
		for(int j=1; j<arr.length; j++) {
			if(arr[j]==false) System.out.println(j);
		}
	}
}
