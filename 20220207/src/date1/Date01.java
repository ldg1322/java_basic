package date1;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 떄
		// Date를 이용해서 날짜 자료를 받아오거나 넘겨주는 것이 권장됩니다.
		// 사용시 import java.util.Date를 위에 입력해야 쓸 수 있습니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀때는 SimpleDateFormat을 활용합니다.
		// import를 추가해야합니다.
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyy-MM");// 소괄호 사이에 양식을 넣어야함
		// 양식은 YYY는 연도, MM은 월, dd는 일, hh는 시, mm은 분 ss 는 초
		String strNow2 = sdf.format(now);// 만들어놓은 Date 변수를 sdf양식으로 고쳐서 저장
		System.out.println(strNow2);
		
		// now 변수에 들어있는 출력양식을 2022년 02월 07일 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		// 469페이지에 보면 simpleDateFormat의 문자 템플릿 목록이 있습니다.
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyy년 MM웡 dd일 hh분 mm분 ss초, 시간대 : z");
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
				
		

	}

}
