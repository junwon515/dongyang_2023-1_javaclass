package java0316;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		// 정수만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(5); // 5 삽입
		a.add(4); // 4 삽입
		a.add(-1); // -1 삽입
		
		// ArrayList 중간에 삽입하기
		a.add(2, 100); // 4와 -1 사이에 정수 100삽입
		
		System.out.println("벡터 내의 요소 객체 수 : " + a.size());
		
		// 모든 요소 정수 출력하기
		for (Integer n : a) {
			System.out.println(n);
		}
		
		// ArrayList 속의 모든 정수 더하기
		int sum = 0;
		for (Integer n : a) {
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}
}
