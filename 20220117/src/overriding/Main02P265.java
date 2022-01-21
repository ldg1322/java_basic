package overriding;

public class Main02P265 {

	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.age = 6;
		l1.gender = "수컷";
		l1.name = "무커";
		l1.howl();
		l1.getInfo();
	}
}

