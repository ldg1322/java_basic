package game.interaction;

public class Warrior {
	// warrior의 특성으로
	// 체력 마나 공격력 경험치 레밸를 넣어주세요
	private int hp;
	private int mp;
	private int str;
	private int lv;
	private int exp;
	// 생성자 를 생성해서 아무것도 입력받지 않고
	// 체력은 20 마나는 10 공격력은 4 레벨은 1 경험치는 0이 자동입력되게 해주세요.
	public Warrior() {
		this.hp = 150;
		this.mp = 100;
		this.str = 30;
		this.lv = 15;
		this.exp = 0;	
	}
	
	public void lv() {
		if(exp > 150) {
			exp -= 30;
			lv++;
			System.out.println(" 레밸이 올랐습니다.");
			System.out.println("");
		}
	}
	
	public void bloodrage() {
		System.out.println(" 피의분노를 사용합니다. ");
		setHp(getHp() -10);
		setstr(getstr() +10);
	}
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨게 해주세요.
		// 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		// orc의 doBattle을 호출해 먼저 오크 체력을 깎고
		orc.doBattele(this.str);
		
		// 오크가 전사의 공격으로 죽는 경우 경험치를 10 더해주시고
		// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		
		if(orc.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("전사의 경험치 : " + this.exp);
		}
			
		// 오크 공격력만큼 자신의 체력을 차감해줍니다.
		this.hp -= orc.getstr();
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	
	public void huntWyvern(Wyvern wyvern) {
		System.out.println(" 와이번을 공격했습니다.");
		if(wyvern.getHp() <= 0) {
			System.out.println("와이번이 이미 죽은 상태입니다.");
			return;
		}
		
		wyvern.doBattele(this.str);
		System.out.println("와이번한테 16의 피해를 입었습니다. ");
		if(wyvern.getHp() <= 0) {
			this.exp += 86;
			System.out.println("와이번을 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("전사의 경험치 : " + this.exp);
		}
		
		
		this.hp -= wyvern.getstr();
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	
	public void huntDragon(Dragon dragon) {
		System.out.println(" 드래곤을 공격했습니다. ");
		if(dragon.getHp() <= 0) {
			System.out.println("드래곤이 이미 죽은 상태입니다.");
			return;
		}
		
		dragon.doBattele(this.str);
		System.out.println("드래곤한테 27의 피해를 입었습니다. ");
			if(dragon.getHp() <= 0) {
			this.exp += 120;
			System.out.println("드래곤을 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
			System.out.println("전사의 경험치 : " + this.exp);
		}
			
		// 오크 공격력만큼 자신의 체력을 차감해줍니다.
		this.hp -= dragon.getstr();
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
	public void getInfo() {
		System.out.println("   전사 스탯    ");
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레밸 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 공격력 : " + getstr());
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getstr() {
		return str;
	}
	public void setstr(int str) {
		this.str = str;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
}
