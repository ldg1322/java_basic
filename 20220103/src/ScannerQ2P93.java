import java.util.Scanner;

public class ScannerQ2P93 {

	public static void main(String[] args) {
		//  환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 YYYY(화폐) 입니다. 로 결과물을 출력해주세요.
		// ex) 원화 350000원을 환전시 3200달러 입니다.
		
		Scanner scan = new Scanner(System.in);
		double rate = 1204;
		System.out.println("미국 달러를 한국 원화로 환전시" + rate);
		System.out.println("달러를 입력해주세요.");
		int dollar = scan.nextInt();
	    System.out.println( dollar+ "달러" + "를 한국 원화로 환전시 ");
	    System.out.println(rate/dollar + "원 입니다.");
		scan.close();
	}

}
