package week1.day3;

import java.util.Arrays;

public class Find_Missing_element_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr1[] = {1,2,3,4,6,7};
  Arrays.sort(arr1);
  for(int i = 0 ; i< arr1.length;i++) {
	  if(arr1[i] != i+1) {
		  
		  System.out.print((i+1));
		  break;
		  
	  }
	  
	  
	
	  
  }
  
	}

}
