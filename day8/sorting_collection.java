package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sorting_collection {

	public static void main(String[] args) {
	    String array[] = { "hcl","wipro","CTS","AspireSystem"};
	    List<String>arrayvalue = new ArrayList<>();
	    
	    for(String s : array) {
	    	arrayvalue.add(s);
	    }
	    System.out.println(arrayvalue);
	    Collections.reverse(arrayvalue);
	    for(String companyname : arrayvalue) {
	    	System.out.println(companyname);
	    }
	    
	    
	    

	}

}
