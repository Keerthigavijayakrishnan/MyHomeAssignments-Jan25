package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		
		//Declare an array
		 List<Integer> intArray = new ArrayList<Integer>();
		 intArray.add(3);
		 intArray.add(2);
		 intArray.add(11);
		 intArray.add(4);
		 intArray.add(6);
		 intArray.add(7);
		 //Length of array
		 int arrayLength = intArray.size();
		 System.out.println("Size of the Array: "+arrayLength);
	    //Sort the Array
		 Collections.sort(intArray);
		 //Find second Largest index value
		 int array1= intArray.get(arrayLength-2);
		 System.out.println("Second Largent Number: "+array1);
		
				 
		
		
		
	}

}
