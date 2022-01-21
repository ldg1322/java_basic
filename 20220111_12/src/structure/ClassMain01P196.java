package structure;

public class ClassMain01P196 {
    
	// personclass를 조회할 메서드는 작성할 필요가 없습니다.
	// 이미 personclass 내부에 필요한 메서드를 작성해놨기 때문입니다.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(personclass)
		PersonClass p1 = new PersonClass();
		p1.name = "wak";
		p1.age = 20;
		p1.pNum = "01048592154";
		p1.tall = 175;
		p1.weight = 75;
		
		PersonClass p2 = new PersonClass();
		p2.name = "angel";
		p2.age = 20;
		p2.pNum = "01078756581";
		p2.tall = 163;
		p2.weight = 48;
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		// 힌트 getinfo의 소속
		p1.getInfo();
		p2.getInfo();
	}
}
