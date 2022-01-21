package game.interaction;

public class Orc {
	// 오크는 hp atk 를 가집니다.
	private int hp;
	private int atk;
	
	// 생성자는 오크에게 hp는 5 atk는 3을 부여합니다.
	public Orc() {
		this.atk = 3;
		this.hp = 5;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력을(uAtk) 입력받아 오크의 체력을 차갑합니다.
	public void doBattele(int uAtk) {
		this.hp -= uAtk;
		System.out.println(" 오크의 남은 체력 : " + this.hp);
	}
	
	// getter/setter도 만들어주세요.
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
}
