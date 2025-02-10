package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Intersection_using_list {

    public static void main(String[] args) {
        // Declare two integer arrays
        Integer[] arr1 = {3, 2, 1, 4, 5, 6};
        Integer[] arr2 = {3, 2, 1, 4, 7, 8};

        // Convert arrays to lists
        List<Integer> l1 = Arrays.asList(arr1);
        List<Integer> l2 = Arrays.asList(arr2);

        // Create an intersection list
        List<Integer> intersection = new ArrayList<>();

        // Find common elements
        for (Integer num : l1) {
            if (l2.contains(num)) {
                intersection.add(num);
            }
        }

        // Print the intersection
        System.out.println("Intersection: " + intersection);
    }
}
