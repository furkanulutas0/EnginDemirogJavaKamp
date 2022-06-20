package tutorials;

public class FindNumber {
	public static void main(String[] args) {
		
		int[] number = {0,1,2,3,4,5,6,7,9};
		
		int searching = 5;
		
		for (int i = 0; i < number.length; i++) {
			if (number[i]==searching) {
				System.out.println("Bulundu");
				break;
			}else {
			}
		}
		
	}
}
