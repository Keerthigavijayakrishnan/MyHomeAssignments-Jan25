package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
	public static void main(String[] args) {
		//Declare a String array
		String[] strArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//Add the collection to a list
		List<String> listArray = new ArrayList<String>();
		listArray = Arrays.asList(strArray);                 //Convert array to list array
		//Sort the array
		Collections.sort(listArray);
		System.out.println(listArray);
		//Size of the array
		int arrayLength = listArray.size();
		//Iterate the values (Reverse loop)
		System.out.println("Reverse String: ");
		for (int i=arrayLength-1; i>=0; i--) {
			System.out.print(listArray.get(i));
			System.out.print(" ");
		}
		
		
		
		
	}

}
