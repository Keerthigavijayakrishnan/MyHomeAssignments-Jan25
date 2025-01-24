package week1.day4;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
		             // 0   1    2     3    4   5   6    7     8      9  10   11 
		  System.out.println("String Input: "+text);
		  System.out.print("String Output: ");   
		  
		   String[] split = text.split(" ");                     //length=12
  
		      
		   //	System.out.println(split[3]);
		 for (int i=0; i<split.length; i++) {       
			 
	        for (int j=i+1; j<split.length; j++)  { 
	        //	 System.out.println(split[j]);
	           if (split[i].equalsIgnoreCase(split[j])) {  
	             split[j]="";                                       //Assign to the text directly
				  
	           }        	   	        	                           //Inside for loop, we changed split[index] value.
	           }
	           } String result = String.join(" ", split);               //Convert from string[] into string using join
	           System.out.println(result);
		 }

	} 
		 
