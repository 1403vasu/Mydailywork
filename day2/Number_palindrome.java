package week1.day2;

public class Number_palindrome {

	public static void main(String[] args) {
    
		int number = 121;
		int orgnum = number;
		int revnum = 0;
		
		while (number != 0) {
			int digit = number % 10;
			revnum = revnum*10+digit;
			number = number/10;
		}
		 if (orgnum == revnum) {
	            System.out.println(orgnum + " is a palindrome.");
	        } else {
	            System.out.println(orgnum + " is not a palindrome.");
	        }

	}

}
