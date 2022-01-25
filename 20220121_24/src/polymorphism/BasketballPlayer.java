package polymorphism;

public class BasketballPlayer extends Person{

		private int score;

		public BasketballPlayer(String name, int age, int score) {
			super(name, age);
			this.score = score;
		}

		public void showPerson() {
		
			System.out.println("득점은 : " + score);
		}
		
		public void showBasketballPlayer() {
			System.out.println("저는 농구선수입니다.");
		}


}
