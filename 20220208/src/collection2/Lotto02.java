package collection2;

import java.util.ArrayList;
import java.util.List;

public class Lotto02 {

	public static void main(String[] args) {
		// List 역시 참조형 변수이기 때문에 주소 값끼리 비교합니다.
		// 따라서 단순 == 비교연산자로 동일비교를 하는게 아니라
		// 리스트1.equals(리스트2) 를 이용해 주소값이 아닌
		// 실제 힙에 저장된 데이터 비교를 해줘야
		// 로또 복권 리스트 내부 숫자가 일치하는지 비교할 수 있습니다.
		// equals는 내부 요소의 순서까지 같이 비교합니다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		System.out.println("주소값 비교 : " + (l2 == l2));
		// 둘 다 빈 리스트이므로 내부에 든 자료끼리만 비교했을 때는 true임
		System.out.println("" + l1 + l2);
		
		// l1과 l2에 각각 요소를 입력하되, 순서에 따른 결과 확인하기
		// l1과 l2에 같은 자료를 넣어주세요. 대신 순서를 다르게 넣어주세요.
		
		// 자료넣기
		l1.add(1);
		l1.add(2);
		l2.add(1);
		l2.add(2);

	}

}
