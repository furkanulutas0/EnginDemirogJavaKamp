package tutorials;

public class PerfectNumber {
	public static void main(String[] args) {
		
		int number = 100;
		int total = 0;
		
		int[] bolenler = {};
		
		for (int i = 1; i < number; i++) {
			if (number%i == 0) {
				total = total +i;
			}
		}
		if (number == total) {
			System.out.println("Mük sayı");
		}else {
			System.out.println("Mük değil");
		}
		
		
		
	}
}
