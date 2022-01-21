package structure;

public class Structure02P190 {
    // Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + ",나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
		
	}
	public static void main(String[] args) {
		// 사람을 두명 만들어 보세요(a,b)
		Person a = new Person();
		a.name="이동길";
		a.age = 25;
		a.pNum = "01012345678";
		a.uNum = 30;
		//System.out.println(a.name + "의 정보입니다.");
		//System.out.println("이름 : " + a.name + ",나이 : " + a.age + ", 연락처 : " + a.pNum + ", 번호 : " + a.uNum);
		
		Person b = new Person();
		b.name = "이동연";
		b.age = 26;
		b.pNum =  "01045612378";
		b.uNum = 20;
		//System.out.println(b.name + "의 정보입니다.");
		//System.out.println("이름 : " + b.name + ", 나이 : " + b.age + ", 연락처 : " + b.pNum + ", 번호 : " + b.uNum);
		getInfo(a);
		System.out.println("-------------------");
		getInfo(b);
	}

}
