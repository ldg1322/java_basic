package inheritance;

// person을 상속해서 Salaryman을 만들어보세요.

public class Salaryman extends Person{
	public int salary;
	public void getSalInfo() {
		System.out.println("이름" + name + "나이" + age + "연봉" + salary);
	}
}
