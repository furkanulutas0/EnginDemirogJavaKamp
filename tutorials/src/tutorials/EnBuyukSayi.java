package tutorials;

public class EnBuyukSayi {
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		int sayi1 = 100;
		int sayi2 = 20;
		int sayi3 = 500;
		int enBuyuk = sayi1;
		
		if (sayi2 > sayi1 && sayi2>sayi3) {
			enBuyuk = sayi2;
		} else if (sayi3 > sayi2 && sayi3 > sayi1) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk sayi: " + enBuyuk);
	}
}
