package Constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차를 한 대 만들어보겠습니다.
		// 연료량은 100
		// 속도는 0
	    // 주인은 본인 이름
		Car c1 = new Car("이동길");
		//c1.gas = 100;
		//c1.speed = 0;
		//c1.owner = "이동길";
		c1.getInfo();
		c1.accelSpeed();
		c1.accelSpeed();
		c1.accelSpeed();
		c1.getInfo();
		c1.breakSpeed();
		c1.getInfo();
		c1.reFuel();
		c1.getInfo();
	}

}
