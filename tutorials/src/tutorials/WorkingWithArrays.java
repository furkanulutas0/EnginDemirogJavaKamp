package tutorials;

public class WorkingWithArrays {
	public static void main(String[] args) {

		double[] myList = {1.2,6.0,2.0,5.2};
		System.out.println("State 1 \n");
		for (double d : myList) {
			System.out.println(d);
		}
		
		// State 2
		System.out.println("\nState 2 ");
		double total = 0.0;
		for (double d : myList) {
			total = total + d;
		}
		System.out.println("Toplam "+ total);
		
		// State 3
		System.out.println("\nState 3 ");
		double max = myList[0];
		
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];				
			}
		}
		
		System.out.println("En Büyük Değer " +max);
	}
}
