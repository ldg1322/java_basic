import java.util.Scanner;

public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드");
		
		for(int i = 0; i < 4; i++) {
			
		for(int j = 0; j < 3-i; j++) { // 별 왼쪽에 들어갈 띄어쓰기
	     System.out.print(" ");
			}		
		for(int k = 0; k < 1+i; k++) {// 별개수가 늘어나는 for문을 작성해주세요.
			System.out.print("*");
	   }
		System.out.println();
		}
	}	
}
