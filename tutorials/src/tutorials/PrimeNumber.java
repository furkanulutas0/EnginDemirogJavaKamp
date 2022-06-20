package tutorials;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int number = 1;
		int reminder = number % 2;
		
		boolean primeOrNot = true;
		
		if (number == 1) {
			System.out.println("is not prime number");
			return;
		}
		if (number < 1) {
			System.out.println("undefined number");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i == 0) {
				primeOrNot = false;
			}
		}
		if (primeOrNot == true) {
			System.out.println("is prime number");
		}else {
			System.out.println("isn't prime number");
		}
	}
}
