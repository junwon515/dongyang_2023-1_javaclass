package java0323;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ans;
		while (true) {
			System.out.print(
					"--------------------------\r\n" + 
					"1. 주소록 입력\r\n" + 
					"2. 주소록 검색\r\n" + 
					"3. 주소록 조회\r\n" + 
					"4. 주소록 수정\r\n" + 
					"5. 주소록 삭제\r\n" + 
					"0. 종료\r\n" + 
					"----------------------------\r\n" + 
					"메뉴를 입력하세요 : ");
			
			ans = scan.nextInt();
			
			if (ans == 1) {
				addressInput();
			} else if (ans == 2) {
//				addressSearch();
			} else if (ans == 3) {
//				addressCheck();
			} else if (ans == 4) {
//				addressUpdate();
			} else if (ans == 5) {
//				addressDelete();
			} else if (ans == 0) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입려하세요.");
			}
		}
	}
	
	public static void addressInput() {
		System.out.println("-1. 주소록 입력 -------");
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = scan.next();
		System.out.print("회사 이름을 입력하세요 : ");
		String com = scan.next();
		LocalDateTime date = LocalDateTime.now();
		ArrayList<Address> addressList = new ArrayList<Address>();
		addressList.add(new Address(name, tel, com, date));
		System.out.println(name+tel+com+date);
	}
}
