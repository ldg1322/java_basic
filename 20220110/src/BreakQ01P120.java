import java.util.Scanner;

public class BreakQ01P120 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받으세요.
		// 1~n까지 차고차곡 순서대로 더해나갔을때
		// 1부터 몇까지 더해야 입력된 정수를 초과하는지 계산해주는
		// 프로그램을 작성해주세요.
		// ex ) 40 입력시 1+2+3+4+5+6+7+8+9=45
		// 1부터 9까지 더하면 40을 초과해 총합이 45가 됩니다. 라고 출력되게 해 주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니다?");
		int goal = scan.nextInt();
		// 바퀴수 
		int count = 1;
		// 총합
		int total = 0;
		// 무한루프
		while (true) {
	   // n바퀴일떄 더함
			total += count;
			if (total > goal) {
				System.out.println("목표값 :" + goal);
				System.out.println("총 합 : " + total);
				System.out.println("몇 까지 더했나? :" + count);
				break;
			}
			// 다 돌았으면 바퀴수 증가
			count++;
		}
		System.out.println("1부터 " + count + "까지의 총 합은 " + goal + "을 초과한 값인" + total + "입니다");
	}

}
