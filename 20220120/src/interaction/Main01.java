package interaction;

public class Main01 {

	public static void main(String[] args) {
		// 판매자 하나 생성
		Seller s1 = new Seller(10);
		// 판매자 정보 조회
		s1.showSeller();
		// 구매자 하나생성
		Buyer b1 = new Buyer(1000000);
		// 구매자 정보 조회
		b1.buyMango(s1, 21);
		// 구매 후 판매자 정보 조회
		s1.showSeller();
		// 구매 후 구매자 정보 조회
		b1.showBuyer();
		
	}
}
 
