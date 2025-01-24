package week1.day4;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1"; 
		             
		  System.out.println("String Input: "+text);
		  System.out.print("String Output: ");   
		  
		   String[] split = text.split(" ");                     
  
		      
		   //	System.out.println(split[3]);
		 for (int i=0; i<split.length; i++) {       
			 
	        for (int j=i+1; j<split.length; j++)  { 
	        //	 System.out.println(split[j]);
	           if (split[i].equalsIgnoreCase(split[j])) {  
	             split[j]="";                                       
				  
	           }        	   	        	                         
	           }
	           } String result = String.join(" ", split);               
	           System.out.println(result);
		 }

	} 
		 
