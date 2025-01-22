package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
	
		int n=99;
		boolean isPrime=true;
			for (int i = 2; i<=n/2 ; i++ ) {
			
				if(n%i==0) {
					isPrime = false;				
				}			
			}
			if (isPrime==true) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
			
		} 
}
