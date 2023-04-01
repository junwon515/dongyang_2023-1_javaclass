package java0316;

import java.util.ArrayList;

public class PhoneEx {
	
	public static void main(String[] args) {
		// 객체 생성
		Phone gS23 = new Phone("galaxyS23", "삼성전자", 1000000);
		Phone gS20 = new Phone("galaxyS20", "삼성전자", 200000);
		Phone i14 = new Phone("iphone14", "애플", 1500000);
		Phone gA33 = new Phone("galaxyA33", "삼성전자", 300000);
		Phone i13 = new Phone("iphone13", "애플", 900000);
		
		// Phone객체만 삽입가능한 ArrayList 컬렉터 생성 후 객체 넣기
		ArrayList<Phone> phones = new ArrayList<>();
		
		phones.add(gS23);
		phones.add(gS20);
		phones.add(i14);
		phones.add(gA33);
		phones.add(i13);
		
		// 제조사별로 출력
		System.out.println("---삼성전자에서 제조된 폰---");
		for (Phone phone : phones) {
			if (phone.getCompany().equals("삼성전자")) {
				System.out.println(phone.getpName() + "은 " + phone.getPrice() + "원에 판매되고 있다");
			}
		}
		System.out.println("\n---애플에서 제조된 폰---");
		for (Phone phone : phones) {
			if (phone.getCompany().equals("애플")) {
				System.out.println(phone.getpName() + "은 " + phone.getPrice() + "원에 판매되고 있다");
			}
		}
		
		// 1000000미만
		System.out.println("\n---100만원미만으로 판매되는 폰---");
		for (Phone phone : phones) {
			if (phone.getPrice() < 1000000) {
				System.out.println(phone.getpName() + "은 " + phone.getCompany() + "에서 제조되고" + phone.getPrice() + "원에 판매되고 있다");
			}
		}
	}
}
