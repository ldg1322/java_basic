package abstract1;

public abstract class Parent {

	private int age;
	
	public Parent() {
		this.age = 40;
	}
	
	// 추상 메서드.
	// 아래와 같이 실행문 없이 선언부만 작성합니다.
	// 실행문이 없어서 자식이 상속받았을때 오버라이딩이 강요됩니다.
	public abstract void getAge();
	
	// 추상 클래스 내부의 일반 메서드는 다른 클래스에서 그랬드
	// 평범하게 작성합니다. 
	// 일반 메서드는 추상 메서드와는 달리 오버라이딩이 자율적입니다.
	public void getInfo() {
		System.out.println("일반 메서드입니다.");
	}
}
