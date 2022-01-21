package accessmodifier;

public class Dog {// 정의부
	// 강아지의 정보를 자율적으로 3개 더 부여해주세요.
	// String name은 고정입니다.
	private String name;
	public int height;
	public int speed;
	
	// 생성자료 강아지 정보를 처리하시되
	// 이름은 무조건 입력받게 해 주세요.
	public Dog(String n) {
		name = n;
		height = 10;
		speed = 13;
	}
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void getInfo() {
		System.out.println("신장 : " + height + ", 속도 : " + speed );	
	}
	public void growth() {
		height += 8;
		speed += 7;
		System.out.println(" 덩치가 " + height + "만큼 커졌습니다." +", 속도가 : " + speed + " 로 빨라졌습니다. ");
	}
}
