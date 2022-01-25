package polymorphism;

// 부모 클래스를 Person으로 가지도록 상속을 해 주세요.
public class Student extends Person{
	// 학생의 등급인 grade 변수를 선언합니다
	private int grade;

	// super()를 이용해 Person 생성지까지 커버하는 생성자를 만들어주세요.
	// name age grade 까지 모두 입력받습니다.
	// 부모쪽에서 쓸 자원인 name, age는 부모쪽으로 넘겨준 다음
	// grade만 자신이 받아서 씁니다.
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	// 상속받은 showPErson()을 활용한 메서드를 추가호 작성해 grade도 찍히게 해주세요.
	public void showPerson() {
		// 부모쪽 showPesrson() 에 이미 name, age를 출력해준ㄴ 구문이 있음.
		System.out.println("성적은 : " + grade);
	}
	// "저는 학생입니다." 라고 콘솔에 찍는 showStudent 메서드를 Student에만 작성합니다.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}

}
