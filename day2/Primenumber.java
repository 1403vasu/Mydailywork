package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		int number = 5;
		boolean value = true;
		
		if(number <= 2) {
			value = false;
		}
		else {
			 for (int i = 2; i * i <= number; i++) { // i * i is equivalent to Math.sqrt(number)
	                if (number % i == 0) { // If divisible, it's not prime
	                    value = false;
	                    break; // Exit the loop early
	                }
	            }
		}
		
        if (value) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

	}

}
