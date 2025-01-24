package week1.day4;

public class ReverseOddWords {
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		 
		System.out.println("Input: "+test);	
		System.out.print("Reverse Odd Words: ");
				
		//Split the words into array
		String[] split = test.split(" ");
	//	System.out.println(split[3]);		
		
		//Traverse through each word using loop
		for (int i=0; i<=split.length-1; i++) {                                  //5-1=4, 01234
			
			//To check the odd words
			if (i%2!=0) {
				//	System.out.println(split[i]);   
				 
				//Covert String into Characters
				char[] charArray = split[i].toCharArray();
				//System.out.println(charArray[1]);
				
				//Reverse the words
			for(int j=charArray.length-1; j>=0; j--) {                           //println-print in next line & print -print in same line
					System.out.print(charArray[j]);                              //System.out.println(charArray[j]);     
				}	System.out.print(" ");			                             //System.out.println(" ");	
			
			}else System.out.print(split[i]+" ");                               //System.out.println(split[i]+" ");
			 
		}
	
		
	}

}
