package praveenReddyDec19Assignment3;

public class vowelQ8 {
	static void FindVovel(String input) {
		char input1;
		int vowels = 0;
		for (int i = 0; i < input.length(); i++) {
			input1 = input.charAt(i);
			if (input1 == 'a' || input1 == 'e' || input1 == 'i' || input1 == 'o' || input1 == 'u') {
				
					System.out.println("vowels from " + input + " are : " + input1);
				
			}
			// else

			// System.out.println("vowels from " + input + " are : " + input1);
		}

	}

	public static void main(String[] args) {
		String input = "automation engineering";
		vowelQ8.FindVovel(input);
	}

}
