package week1.day4;

public class OddIndexToUppercase {
	public static void main(String[] args) {
		String test = "changeme"; 
		System.out.println("Input: "+test);	
		System.out.print("Changed Odd Index To Uppercase: ");
				
		
		char[] charArray = test.toCharArray();
		//System.out.println(charArray[0]);		
	
		
		for (int i=0; i<=charArray.length-1; i++) {                                 
			
			if (i%2!=0) {
				char uppercase = Character.toUpperCase(charArray[i]);
					System.out.print(uppercase);   
			}else System.out.print(charArray[i]);                                  
					                                                                  
		}

	}

		
	}					                                                          
			
			
	
