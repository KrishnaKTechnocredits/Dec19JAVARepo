package gautysingh.assignment1;

public class CountVowels {

	public static int vowelCount = 0;
	public static int vowel_A = 0;
	public static int vowel_E = 0;
	public static int vowel_I = 0;
	public static int vowel_O = 0;
	public static int vowel_U = 0;

	public static void main(String[] args) {
		/*System.out.println("please enter a string :> ");
		Scanner sc = new Scanner(System.in);*/
		String str = "sagavioue";
		
		for (int i = 0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				vowelCount += 1;
				vowel_A ++;
			} else if (ch == 'e') {
				vowelCount += 1;
				vowel_E ++;
			} else if (ch == 'i') {
				vowelCount += 1;
				vowel_I ++;
			} else if (ch == 'o') {
				vowelCount += 1;
				vowel_O ++;
			} else if (ch == 'u') {
				vowelCount += 1;
				vowel_U ++;
			}

		}

		System.out.println("Total Vowel : " + vowelCount);
		System.out.println("Vowel A : " + vowel_A);
		System.out.println("Vowel E : " + vowel_E);
		System.out.println("Vowel I : " + vowel_I);
		System.out.println("Vowel O : " + vowel_O);
		System.out.println("Vowel U : " + vowel_U);

	}

} 
