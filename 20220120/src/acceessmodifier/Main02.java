package acceessmodifier;

public class Main02 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("떵개");
		w1.getInfo();
		System.out.println("==============");
		w1.hunt();
		w1.getInfo();
		System.out.println("==============");
		w1.doubleAttack();
		System.out.println("==============");
		w1.getInfo();
		
	}
}
