package structure;

public class Structure03P190 {

	public static void getInfo(Dog d) {
		System.out.println("이름 : " + d.name +
				           ", 털 색깔 : " + d.color + 
				           ", 몸무게 : " + d.weight);
	}
	public static void main(String[]args) {
		Dog a = new Dog();
		a.name = "Messi";
		a.color = "노란색";
		a.weight = 15;
		
		Dog b = new Dog();
		b.name = "Wak";
		b.color = "검정색";
		b.weight = 13;
		getInfo(a);
		getInfo(b);
				
	}
}
