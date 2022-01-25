package game.interaction;

public class Orc {
	// 오크는 hp str 를 가집니다.
	private int hp;
	private int str;
	
	// 생성자는 오크에게 hp는 5 str는 3을 부여합니다.
	public Orc() {
		this.str = 5;
		this.hp = 15;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력을(ustr) 입력받아 오크의 체력을 차갑합니다.
	public void doBattele(int ustr) {
		this.hp -= ustr;
		System.out.println(" 오크의 남은 체력 : " + this.hp);
	}
	
	// getter/setter도 만들어주세요.
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getstr() {
		return str;
	}
	public void setstr(int str) {
		this.str = str;
	}
}
