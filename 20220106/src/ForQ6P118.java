import java.util.Scanner;

public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드 형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 중첩 반복문을 사용해 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느 지점이 다음줄로 내리고, 어느 부분이 별을 나열하는지 생각해보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드");	
		for(int i= 1; i <= 5; i++) {
			for(int j= 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}

}
