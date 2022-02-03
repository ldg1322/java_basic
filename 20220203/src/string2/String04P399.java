package string2;

public class String04P399 {

	public static void main(String[] args) {
		// .length()는 문자열의 길이를 알 수있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name = " 가나다 라마바 사아자 카타파하 ";
		System.out.println(name.length());
		
		// .replace()는 찾아 바꾸기 입니다.
		//.replace("찾을 단어", "바꿔줄 단어"); 순으로 입력합니다.
		String report = "안녕하세요. 보고자 오영택, 오영택입니다.";
		// .replace는 return이 String이고, 그냥은 콘솔창에 결과가 안 찍힙니다.
		System.out.println(report.replace("오영택", "이동길"));
		// .replace()는 시뮬레이션만 하기 떄문에 실행해도 실제 문자열이 영구적으로 변하지 않습니다.
		System.out.println(report);
		
		// 바뀐 내역을 저장까지 하고 싶다면...
		report = report.replace("오영택", "이동길");
		System.out.println(report);
	}

}
