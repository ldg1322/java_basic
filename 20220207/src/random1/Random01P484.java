package random1;

import java.util.Random;

public class Random01P484 {

	public static void main(String[] args) {
		// Random 클래스는 Mate.random()보다 좀 더 간단하게
		// 다양한 종류의 난수값을 얻을 수 있도록 도화줍니다.
		// java.util을 통해 import 할 수 있습니다.
		Random random = new Random();
		
		boolean result = random.nextBoolean();
		
		System.out.println(result);
	}

}
