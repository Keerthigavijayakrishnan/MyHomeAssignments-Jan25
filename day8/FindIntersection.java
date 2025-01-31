package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		//Declare an array1
		 List<Integer> array1 = new ArrayList<Integer>();
		 array1.add(3);
		 array1.add(2);
		 array1.add(11);
		 array1.add(4);
		 array1.add(6);
		 array1.add(7);
		 //Length of array1
		 int arraylength1 = array1.size();
		 System.out.println("Size of the Array1: "+arraylength1);
		 //Iterate the value for array1
		 List<String> allStrings1 = new ArrayList<String>();

        	 for (Integer num : array1) {
                 allStrings1.add(num.toString());
            		 }   System.out.println("Array1: "+allStrings1);
		 
		 //Declare an array2
		 List<Integer> array2 = new ArrayList<Integer>();
		 array2.add(1);
		 array2.add(2);
		 array2.add(8);
		 array2.add(4);
		 array2.add(9);
		 array2.add(7);
		//Length of array2
		 int arraylength2 = array2.size();
		 System.out.println("Size of the Array1: "+arraylength2);
		 //Iterate the value for array1
		 List<String> allStrings2 = new ArrayList<String>();

        	 for (Integer num : array2) {
                 allStrings2.add(num.toString());
            		 }   System.out.println("Array2: "+allStrings2);
            		 
            		 //Compare both arrays
            		 if (allStrings1.equals(allStrings2)) {
            			 System.out.println("Array1 and Array2 both are equal: " +allStrings1);
            		 }else {
            			 System.out.println("Array1 and Array2 are not equal");
            		 }
		
	}

}
