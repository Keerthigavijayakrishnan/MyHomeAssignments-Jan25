package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintSameValues {
	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};                            
		Arrays.sort(a);                                     
		int b[] = {1,2,8,4,9,7};                             
		Arrays.sort(b);
		System.out.println("Mathing elements in two arrays:");
		
		for(int i=0; i<a.length; i++) {                      
			
			for(int j=0; j<b.length; j++) {                  
				
				if (a[i]==b[j]) {                           
					System.out.println(a[i]);
				}
			}
		}
	}

}
