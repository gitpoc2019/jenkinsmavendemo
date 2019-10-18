package Learningjava_day1;

public class Array_exception {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int abc[] = new int[4];

		try{
			int result=a/b;
		System.out.println(result);
		}

		catch (ArithmeticException e){
			System.out.println("Divided by Zero Error"); 
			
			}

		System.out.println("Hello Java");
		try{
			abc[5]=200;
			System.out.println(abc[5]);
		}
		catch(ArrayIndexOutOfBoundsException e2){
			
			System.out.println("Array Index OutOfBounds Exception");
		}
		System.out.println("Hello Selenium");
	}





}
