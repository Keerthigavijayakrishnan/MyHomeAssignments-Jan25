package week1.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintSameValues {
	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};                            //012345
		Arrays.sort(a);                                      //2,3,4,6,7,11
		int b[] = {1,2,8,4,9,7};                             //1,2,4,7,8,9
		Arrays.sort(b);
		System.out.println("Mathing elements in two arrays:");
		
		for(int i=0; i<a.length; i++) {                      
			
			for(int j=0; j<b.length; j++) {                  //once the for loop ends then only the next loop continue. i1 start and j1..6 continue and end->i2 start and j1..6 continue and end->i3..like this.
				
				if (a[i]==b[j]) {                            //a[0]2=b[0]1,a[0]2=b[1]2,a[0]2=b[2]4,a[0]2=b[3]7,a[0]2=b[3]8,a[0]2=b[3]9. once completed the flow,it goes to for(i loop) then a[1]2=b[0]1,a[1]2=b[1]2,a[1]2=b[2]4,a[1]2=b[3]7,a{1]2=b[3]8,a[1]2=b[3]9..it will continue
					System.out.println(a[i]);
				}
			}
		}
	}

}
