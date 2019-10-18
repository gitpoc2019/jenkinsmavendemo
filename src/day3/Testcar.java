package day3;

public class Testcar {
 String name;
 int price;
	public static void main(String[] args) {

		toyota t = new toyota();
		t.mile();
		t.start();
		t.stop();
		
		merce m= new merce();
		m.start();
		m.stop();
		m.gps();
		
		car c1 = new merce();
		car c2= new toyota();
		System.out.println("------------------");
		
		c1.start();
		c2.stop();
	}

}
