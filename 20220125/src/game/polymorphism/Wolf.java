package game.polymorphism;
// Wolf를 상속하게 해 주세요.
public class Wolf extends Monster {
	// wolf는 생성자를 통해 체력 30, 공격력 8를 갖습니다.
	// 입력받지 않고 고정된 수치로 생성합니다.
	public Wolf() {
		super(30, 8, 10 , "늑대");
	}
}
