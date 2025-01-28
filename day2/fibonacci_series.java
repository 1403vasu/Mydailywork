package week1.day2;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of tearms");
		int range = sc.nextInt();
		
		int f = 0; int s=1; 
		System.out.println("Fibonacci Series:");
		 for (int i = 1; i <= range; i++) {
			 System.out.print(f + " ");

	            // Calculate the next term
	            int next = f + s;

	            // Update the values of first and second
	            f = s;
	            s= next;
			 
		 }
		
		
				

	}

}
