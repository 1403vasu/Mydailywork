package day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class second_largest_element {

	public static void main(String[] args) {
		
		Integer[] arr = {3, 2, 11, 4, 5, 6};

        // Convert the array to a list
        List<Integer> l1 = Arrays.asList(arr);

        // Sort the list in ascending order
        Collections.sort(l1);
        
        int secondlargest = l1.get(l1.size()-2);
        
        System.out.println(secondlargest);
	}

}
