package week1.day3;

public class Print_array_class {

	public static void main(String[] args) {
		  int[] array = {2,5,7,7,5,9,2,3};
	        System.out.println("Duplicate values:");

	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                    System.out.println(array[i]);
	                     
	                }
	            }
	        }
	    }

	}


