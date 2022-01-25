package game.interaction;

public class Dragon {
	
		private int hp;
		private int str;
		
		public Dragon() {
			this.str = 27;
			this.hp = 68;
		}
		
		public void doBattele(int ustr) {
			this.hp -= ustr;
			System.out.println(" 드래곤의 남은 체력 : " + this.hp);
		}
		public void getInfo() {

			System.out.println("드래곤의 체력 : " + getHp());
			System.out.println("드래곤의 공격력 : " + getstr());
		}
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
