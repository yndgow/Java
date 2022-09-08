package sub4;

import java.util.HashSet;
import java.util.Set;

/*
 * 날짜 : 2022/09/08
 * 이름 : 김지홍
 * 내용 : 자료구조 Set 실습하기
 * 
 * Set
 *  - 입력되는 데이터의 순서를 고려하지않고, 중복을 허용하지 않는 자료구조
 *  - 중복된 데이터를 제ㅓㄱ하거나 이미 데어타가 존재하는지 검사할 때 사용
 *  - HashSet은 Set을 일반화 시킨 컬렉션
 */ 

public class SetTest {
	public static void main(String[] args) {

		// 집합 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(2);
		set.add(3);
		
		// 집합 갯수
		System.out.println("set 집합 원소 갯수 : " + set.size());
		
		// 집합 출력
		System.out.println(set);
		
		for (int n : set) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
