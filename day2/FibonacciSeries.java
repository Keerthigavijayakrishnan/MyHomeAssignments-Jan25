package week1.day2;



public class FibonacciSeries {

	public static void main(String[] args) {
		 
		 int n1=0;
		 int n2=1;
		 System.out.println("Fibonacci Series:");
		 
		for (int i = 0; i<8; i++) {
			
			System.out.println(n1);
			int n3=n2+n1; 
			n1=n2; 
			n2=n3;
			
			
		}
		
	}
}
