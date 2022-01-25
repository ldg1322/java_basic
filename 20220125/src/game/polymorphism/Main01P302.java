package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// warrior 하나, wolf하나를 생성해주세요.
		// 생성 후 교전까지 해주세요.
		Warrior w1 = new Warrior("밥");
		Monster a1 = new Wolf();
		Monster b1 = new Biackiss();
		Monster v1 = new Valtan();
		w1.hunt(a1);
		System.out.println("");
		w1.hunt(a1);
		System.out.println("");
		w1.hunt(a1);
		System.out.println("---------------");
		// 이미 몬스터 계열에 필요한 정보는 모두 Monster 클래스에
		// 작성되어있으므로 그냥 체력수치와 공격력 수치만 몬스터별로 관리하면 됩니다.
		w1.hunt(b1);
		System.out.println("");
	}

}
