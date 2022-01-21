package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		Parttimer p1 = new Parttimer(true,"과일", "1동길");
		System.out.println("-----------------------");
		Parttimer p2 = new Parttimer(false, 15000, "카페", "2동길");
		System.out.println("-----------------------");
		// 시급 5000원을 넣고 파트타이머를 만들어보세요.
		Parttimer p3 = new Parttimer(true, 5000, "놀이공원", "3동길");
		System.out.println("-----------------------");
	}

}
