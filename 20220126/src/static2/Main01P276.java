package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 없이 발표점수를 콘솔에 찍어보세요.
		System.out.println(Asean.presentationScore);
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해보세요.
		Asean a1 = new Asean(1, 80 , 90);
		Asean b1 = new Asean(2, 81, 89);
		Asean c1 = new Asean(3, 75, 97);
		Asean d1 = new Asean(4, 89, 94);
		
		a1.showAseanInfo();
		b1.showAseanInfo();
		c1.showAseanInfo();
		d1.showAseanInfo();
		

	}

}
