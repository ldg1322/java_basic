package acceessmodifier;

public class Warrior extends Commoner{
	public Warrior(String name) {
		super(name);
	
	}
	
	
	public void hunt() {
		System.out.println(" 전사가 사냥을 시작합니다. ");
		setHp(getHp() -1 );
		setExp(getExp() + 10);
	}
	
	public void doubleAttack() {
		System.out.println(" 스킬을 사용합니다. ");
		setHp(getHp() -4);
		setExp(getExp() + 25);
	}
	
	public void getInfo() {
		
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레밸 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 닉네임 : " + getName());
	}
}
