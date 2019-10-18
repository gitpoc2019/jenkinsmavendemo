package day2;

public class book {
	
	static String name;
	static int price;
	static int discount;
	
	public void startreading(){
		System.out.println("startreading book name "+name);
	}
	public void buybook(){
		System.out.println("Book Price "+ (price-discount));

	}

}
