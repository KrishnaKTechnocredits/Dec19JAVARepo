package chaitanyaKDec19.AssignmentThree;

public class Question08 {

	void displayVowelCount(String a) {

		int vowelCnt = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == ' ')
				i++;

			if (a.charAt(i) == 'a' || a.charAt(i) == 'A') {
				vowelCnt++;
			} else if (a.charAt(i) == 'e' || a.charAt(i) == 'E') {
				vowelCnt++;
			} else if (a.charAt(i) == 'i' || a.charAt(i) == 'I') {
				vowelCnt++;
			} else if (a.charAt(i) == 'o' || a.charAt(i) == 'O') {
				vowelCnt++;
			} else if (a.charAt(i) == 'u' || a.charAt(i) == 'U') {
				vowelCnt++;
			}
		}

		System.out.println("Vowel count in a given string is: " + vowelCnt);
	}
}
