package java0330;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {
	
	static ArrayList<Address> addressList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ans;
		while (true) {
			System.out.print("--------------------------\r\n" + 
					"1. 주소록 입력\r\n" + 
					"2. 주소록 검색\r\n" + 
					"3. 주소록 조회\r\n" + 
					"4. 주소록 수정\r\n" + 
					"5. 주소록 삭제\r\n" + 
					"0. 종료\r\n" + 
					"----------------------------");
			
			ans = scan.nextInt();
			
			if (ans == 1) {
				addressInput();
			} else if (ans == 2) {
				addressSearch();
			} else if (ans == 3) {
				addressCheck();
			} else if (ans == 4) {
				addressUpdate();
			} else if (ans == 5) {
				addressDelete();
			} else if (ans == 0) {
				break;
			} else {
				System.out.println("잘못된 입력 입니다. 다시 입력하세요. ");
			}
		}
	}
	
	// 삭제
	public static void addressDelete() {
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = scan.next();
		
		for (int i = 0; i < addressList.size(); i++) {
			if (addressList.get(i).equals(name)) {
				addressList.remove(i);
			}
		}
	}
	
	// 수정
	public static void addressUpdate() {
		System.out.print("수정할 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("수정할 전화번호를 입력하세요 : ");
		String tel = scan.next();
		System.out.print("수정할 회사 이름을 입력하세요 : ");
		String com = scan.next();
		for (Address address : addressList) {
			if (address.getName().equals(name)) {
				address.setTel(tel);
				address.setCom(com);
				System.out.println(address + "로 수정되었습니다. ");
			}
		}
	}
	
	// 조회
	public static void addressCheck() {
		for (Address address : addressList) {
			System.out.println(address);
		}
	}
	
	// 검색
	public static void addressSearch() {
		System.out.println("검색할 이름을 입력하시오 : ");
		String name = scan.next();
		for (Address address : addressList) {
			if (address.getName().equals(name)) {
				System.out.println(address);
			}
		}
	}
	
	// 입력
	public static void addressInput() {
		System.out.println("-1. 주소록 입력 -------");
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("전화번호를 입력하세요 : ");
		String tel = scan.next();
		System.out.print("회사 이름을 입력하세요 : ");
		String com = scan.next();
		LocalDateTime date = LocalDateTime.now();
		addressList.add(new Address(name, tel, com, date));
		System.out.println("[주소록 : " + name + tel + com + date + "]");
	}
	
}
