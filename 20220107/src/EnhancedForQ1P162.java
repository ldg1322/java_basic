import java.util.Arrays;

public class EnhancedForQ1P162 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		//  math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28 , 39, 74, 65, 90, 98
		// 위 3개의 변수명으로 배열을 만들어 자료를 담아주신  다음
		// 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		// 콘솔창에 출력해주세요
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int mathTotal = 0;
		for(int score:math) {
			mathTotal += score;
		}
		System.out.println("수학 평균 : " + mathTotal / math.length);
		System.out.println("==============="); 
		
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int engTotal = 0;
		for(int score:eng) {
			engTotal += score;
		}
		System.out.println("영어 평균 : " + engTotal / eng.length);
		System.out.println("===============");
		
		int[] com = {10, 28 , 39, 74, 65, 90, 98};
		int comTotal = 0;
		for(int score : com) {
			comTotal += score;
		}
		System.out.println("컴퓨터 평균 : " + comTotal / com.length);
	}
}
