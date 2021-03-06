package accesmodifier;

public class Magician extends Commoner{
	// 생성자를 만들어주세요.
		// Magician측에서 설정하는 변수는 추가로 없지만
		// 생성자는 상속되지 않으므로 부모쪽 생성자를
		// 처리할 수 있도록 만들어주세요.
		
		public Magician(String name) {
			super(name);
		
		}
		
		// 사냥 메서드를 만들겠습니다.
		public void hunt() {
			System.out.println(" 마법사가 사냥을 시작합니다. ");
			// hp -= 2; // private 요소는 자식쪽에서도 컨트롤 불가능.
			// public인 setter의 일종인 setHp를 대신 활용합니다.
			// sethp(5)인 경우, 기존의 값 대신 hp 변수에 5로 교체해달라는 요청입니다.
			// 현재 원하는 것은 현재 hp값에서 2가 깎인 값이 새로운 hp로 저장되는 것 입니다.
			// setter와 getter(setHp(), getHp()를 적적히 활용해 
			// 전투할떄마다 체력이 2씩 깍이도록 로직을 작성해주세요.
			setHp(getHp() -2 );
			// 경헙치도 마찬가지로
			// exp += 10; 을 직접 실행할 수 없으므로 
			// setExp()를 활용합니다.
			// 현재 원하는 것은, 현 exp값에서 사냥시마다 10씪 경험치가 증가하는것입니다.
			setExp(getExp() + 10);
		}
}
