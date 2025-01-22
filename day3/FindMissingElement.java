package week1.day3;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int a[] = {1,4,3,2,8,6,7};
		int j=1;
		Arrays.sort(a);                             
		System.out.println("Missing Number: ");
		 
		for (int i=0; i<a.length; i++) {            
			
			
			if(a[i]!=j) {                          
				System.out.println(j);
				break;
			} j++;
			
		}
			
	}

}
