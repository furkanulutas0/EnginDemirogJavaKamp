package tutorials;

public class VowelDemo {
	public static void main(String[] args) {
		
		char Char = 'z';
		
		char[] boldVowels = {'A','I','O','U','a','ı','o','u'};
		char[] thinVowels = {'E','İ','Ö','Ü','e','i','ö','ü'};
		
		for (int i = 0; i < boldVowels.length; i++) {
			if (Char == boldVowels[i]) {
				System.out.println("Kalın Sesli Harftir");
				break;
			}else if (Char == thinVowels[i]) {
				System.out.println("İnce Sesli Harftir");
				break;
			}
		}
		
	}
}
