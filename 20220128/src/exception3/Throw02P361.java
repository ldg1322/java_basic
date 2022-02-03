package exception3;

public class Throw02P361 {

	public static void main(String[] args) {
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킵니다.
		// Math.random()은 0 <= 난수 < 1 의 범위를 가지는 난수를 발생시킵니다.
		// 범위를 0 ~ 9로 만들고 싶다면? * (범위수 + 1 );
		int randomNum = (int)(Math.random() * 10);
		
		try {
			if(randomNum > 3) {
				// 발생하지도 않은 ArrayIndexOutOfBoundsException 만들기
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위의 난수 발생");
			}
		} catch (Exception e ) {
			System.out.println("없던 예외를 만들었습니다.");
			// 콘솔에 상세 예외 정보를 보려면 printStackTrace();를 호출합니다
			e.printStackTrace();
		}
		System.out.println("dfsmalkfklsa");
	}

}
