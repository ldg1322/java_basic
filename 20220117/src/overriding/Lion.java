package overriding;

public class Lion extends Animal {
	public String use;
	
	public void howl() {
		System.out.println("으르렁");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender);
	}
}
