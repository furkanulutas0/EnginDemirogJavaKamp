package tutorials;

public class SwitchStatement {
	public static void main(String[] args) {
		
		char vehicleClass = 'F';
		
			
		switch (vehicleClass) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Araç sınıfınız : "+ vehicleClass + ". Köprüden geçebilirsiniz");
			break;
		case 'D':
			System.out.println("Araç sınıfınız : "+ vehicleClass + ". Köprüden geçmeniz yasak!");
			break;
		default:
			System.out.println("Sınıf Bulunamadı");
			break;
		}
	}
}
