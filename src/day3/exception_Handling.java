package day3;


public class exception_Handling {

	public static void main(String[] args) {
int x=10;
int y=0;
try{
System.out.println(x/y);
}

 catch(Exception e){
	System.out.println("error occured"+ e.getMessage());
	e.printStackTrace();

}
	}
	

}
