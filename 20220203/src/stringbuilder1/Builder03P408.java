package stringbuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다.
		// Delete(시작인덱스 번호, 끈 인덱스 번호)를 입력하면
		// 시작 지점부터 끝 지점 사이를 샂게해줍니다.
		StringBuilder a = new StringBuilder("asdfg");
		System.out.println(a);
		a.delete(2, 5);
		System.out.println(a);

	}

}
