package day2;

public class arraytest {

	public static void main(String[] args){
		int x[] ={31,4,98,9,2738,8902};
		int y=x[0];
		for(int i=1;i<x.length;i++){
			if(y>x[i]){
				y=x[i];
			}
		}
System.out.println(y);
	
	}
}

/*public class arraytest {

	public static void main(String[] args) {
		
		System.out.println("Even Numbers from 2 to 10 are");	
		for(int i=2;i<=10;i=i+2){
			
		

System.out.println( i);

	}

}*/


	