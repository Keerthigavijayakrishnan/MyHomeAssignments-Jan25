package week1.day3;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		int a[] = {1,4,3,2,8,6,7};
		int j=1;
		Arrays.sort(a);                             //1,2,3,4,6,7,8
		System.out.println("Missing Number: ");
		 
		for (int i=0; i<a.length; i++) {            //i=0; and if(a[i]!=j) not used i=a[0] and if(i!=j) because, it not gets increased (i++) into a[1]. instead of, it works like a[0]=1 and increased(i++) like 1+1=2
			
			
			if(a[i]!=j) {                          //a[0]1=j(1),a[1]2=j(2),a[2]3=j(3),a[3]4=j(4),a[4]6=j(5)
				System.out.println(j);
				break;
			} j++;
			
		}
			
	}

}
