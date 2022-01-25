package game.interaction;

public class Priest {
		
		private int hp;
		private int mp;
		private int str;
		private int lv;
		private int exp;
		
		public Priest() {
			this.hp = 100;
			this.mp = 120;
			this.str = 13;
			this.lv = 12;
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
		
		public void HolyLight() {
			System.out.println(" 성스러운 빛을 사용합니다. ");
			setHp(getHp() +10);
			System.out.println(" 체력이 10 상승");
			setMp(getMp() - 13);
			System.out.println(" 마나 13 차감 ");
		}
		
		public void huntOrc(Orc orc) {
			
			if(orc.getHp() <= 0) {
				System.out.println("오크가 이미 죽은 상태입니다.");
				return;
			}
			
			orc.doBattele(this.str);
					
			if(orc.getHp() <= 0) {
				this.exp += 10;
				System.out.println("오크를 죽였습니다. 경험치가 " + this.exp + "올랐습니다.");
				System.out.println("사제의 경험치 : " + this.exp);
			}
				
			this.hp -= orc.getstr();
			System.out.println("사제의 남은 체력 : " + this.hp);
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
				System.out.println("사제의 경험치 : " + this.exp);
			}
			
			
			this.hp -= wyvern.getstr();
			System.out.println("사제의 남은 체력 : " + this.hp);
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
				System.out.println("사제의 경험치 : " + this.exp);
			}
				
			this.hp -= dragon.getstr();
			System.out.println("사제의 남은 체력 : " + this.hp);
		}
		public void getInfo() {
			System.out.println("   사제 스탯    ");
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