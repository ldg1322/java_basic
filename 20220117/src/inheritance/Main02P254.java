package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에느ㅡㄴ 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아석 작성하세요
		// 생성한 객체의 정보를 get~~info()를 이용해 콘솔에도 같이 찍어주세요.
		Salaryman a1 = new Salaryman();
		a1.name = "이동길";
		a1.age = 26;
		a1.salary = 10000000;
		
		a1.getInfo();
		a1.getSalInfo();
		
		Student a2 = new Student();
		a2.name = "김수현";
		a2.age = 31;
		a2.stuNum = 15;
		
		a2.getStuInfo();

	}

}
