package day2;

public class day2test {

	public static void main(String[] args) {

		int x[] = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7,
				6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311, 1 };
		
int b=0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		for (int i = 0; i < x.length; i++) {
			System.out.println("Array in ascending order -> " + x[i]);
		}
		 
		System.out.println(x.length + "length"); 
		int c = 1;
		for (int i = 0; i < x.length-1 ; i++) {
			b=i+1;
			if (x[i] != x[i + 1]) {
				System.out.println(x[i] + " repeated " + c + " times ");
				c = 1;
			} 
			else {
				c++;
			}
		
			if (b == x.length-1) {
				System.out.println(x[b] + " repeated " + c + " times ");
		}
		
		}

	}
}
