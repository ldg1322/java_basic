package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레티어를 만들어주세요.
		// 몇 장을 사야 당첨되는지 시뮬레이션 해보겠습니다.
		
		// 1. 당첨번호 6개를 뽑습니다.
		// Integer를 저장 받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
		
		// 로또 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum = 0;
		
		// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록 
		while(lotto.size() !=6) {
			// 번호 뽑기
			getNum = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목록에 포함되어 있지 않다면
			if(!lotto.contains(getNum)) {
				// 추가하기
				lotto.add(getNum);
			}
		}
		// 다 돌면 정렬하기
		Collections.sort(lotto);
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복중지
		// 4. 3에서 일치하지 않으면 반복회수를 1더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야 합니다.
		// 조건식은 당첨인 경우 탈출로 해주시면 됩니다.
		while(!lotto.equals(luckyNum)) {
			// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
			luckyNum.clear();
			
			// while문 조건은 번호를 ArrayList의ㅡ 내부 요소 개수가 6이 되면 종료되도록
			while(luckyNum.size() ! = 6) {
		}

	}

}
