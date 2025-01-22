package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		
/*	Method 1 - To check the range of numbers are prime or not
    int n;
	boolean isPrime=true;
	for (int j=2; j<10; j++) {
		isPrime=true;
		for (int i = 2; i<=j/2 ; i++ ) {
		
			if(j%i==0) {
				isPrime = false;				
			}			
		}
		if (isPrime==true) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
	} 
	}  */
		
		//Method 2 - To check the given number is prime or not
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
