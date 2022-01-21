package structure;

public class PersonClass {
    // 사람 정보를 Person과 동일하게 만들어주시되
	// 여러분이 추가하고 싶은 특성 하나를 더 추가해보세요.
	public String name;
	public int age; 
	public String pNum; 
	public int weight; 
	public int tall;

	// getinfo 메서스도 같이 personclass 안에 정의합니다.
	// 클래스 내부에 생성할때는 public 오른쪽에 오던 static 키워드를 뺍니다.
	// 자기와 같은 지역 내의 요소는 소속 명시 없이 조회가 가능합니다.
	public void getInfo(){
    System.out.println("이름 : " + name +
    		           ", 나이 : " + age +
    		           ", 번호 : " + pNum +
    		           ", 몸무게 : " + weight +
    		           ", 키 : " + tall);
      }
}

