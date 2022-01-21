package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		Car a = new Car();
		a.model = "BMW M340i";
		a.price = 78200000;
		a.owner = "Wak";
		
		Car b = new Car();
		b.model = "Bugatti La Voiture Noire";
		b.price = 22497000000L;
		b.owner = "이동길";
		
		// 콘솔에 정보 조회하기
		a.getInfo();
		b.getInfo();
	}
}
