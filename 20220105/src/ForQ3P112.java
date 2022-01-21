import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		// 구구단을 작성해보세요
		// Scanner를 이용해서 int dan에 정수를 받아주세요.
		// dan에 값을 받으면
		// dan * 1부터 dan *9 까지 순차적으로 콘솔창에 찍히게 만들어주세요.
		// for문에서 쓰기위해 선언한  i도 숫자가 저장된 변수이기 때문에
		// 연산에 사용할 수 있습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 작성");
	    int dan = scan.nextInt();
	    
	    for(int i = 1; i < 10; i++) {
	    	System.out.println(dan + "*" + i + " = " + dan * i);
	    }
	      
	}

}
