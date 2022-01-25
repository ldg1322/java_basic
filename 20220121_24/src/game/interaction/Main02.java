package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.getInfo();
		System.out.println();
		Wyvern m1 = new Wyvern();
		m1.getInfo();
		System.out.println("-----------------");
		w1.huntWyvern(m1);
		System.out.println("-----------------");
		w1.huntWyvern(m1);
		System.out.println("------------------");
		w1.getInfo();
		System.out.println("-------------------");
	    w1.bloodrage();
	    w1.getInfo();
		System.out.println("------------------");
		Dragon d1 = new Dragon();
		d1.getInfo();
		System.out.println("------------------");
		w1.huntDragon(d1);
		System.out.println("------------------");
		w1.huntDragon(d1);
		System.out.println("");
		
		Priest p1 = new Priest();
		p1.getInfo();	
		Wyvern w2 = new Wyvern();
		w2.getInfo();
		System.out.println("");
		p1.huntWyvern(w2);
		System.out.println("");
		p1.huntWyvern(w2);
		System.out.println("");
		p1.HolyLight();
		p1.getInfo();
		System.out.println("");
		p1.huntWyvern(w2);
		System.out.println("");
		p1.huntWyvern(w2);
		System.out.println("");
		p1.getInfo();
		System.out.println("");
		
		Warlock h1 = new Warlock();
		h1.getInfo();
		Dragon d2 = new Dragon();
		System.out.println("");
		h1.huntDragon(d2);
		h1.ShadowBolt();
		d2.getInfo();
	}

}
