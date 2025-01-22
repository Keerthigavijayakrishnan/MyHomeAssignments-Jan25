package week1.day2;

import java.util.Iterator;

public class Palindrome {
	
	public static void main(String[] args) {
	
		int input =121;
	// int input = 124;
		 int output=0;
		int rem;
		for (int i=input; i>0; i=i/10) {
		
			rem = i%10;
			output=output*10+rem; 
			System.out.println(output);
		}
		
		if (input==output) {
			System.out.println("It's a palindrome");
		}else {
			System.out.println("It's not a palindrome");
		}
		 
    }
}

