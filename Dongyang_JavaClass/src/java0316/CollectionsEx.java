package java0316;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList); // 요소 정렬
		// ArrayList 출력(정렬, 반대)
		for (String item : myList) {
			System.out.println(item);
		}
		System.out.println("\n--반대--");
		Collections.reverse(myList);
		for (String item : myList) {
			System.out.println(item);
		}
		
		int index = Collections.binarySearch(myList, "아바타");
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}
}
