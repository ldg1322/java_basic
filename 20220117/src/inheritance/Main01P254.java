package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// student가 person을 상속했기 때문에
		// studnt는 person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "이동길";
		s1.age = 26;
		s1.stuNum = 10;
		
		s1.getInfo();
		s1.getStuInfo();
		
		// Student를 하나 더 만들어주시고
		// 코드는 복붙해서 보내주시고
		// 메모리구조는 그림으로 그려서 캡쳐해서 보내주세요.
		
		Student s2 = new Student();
		s2.name = "동길";
		s2.age = 25;
		s2.stuNum = 19;
		
		s2.getInfo();
		s2.getStuInfo();
	}

}
