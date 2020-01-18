package aparnaVDec19.assignment3;

/*
 * 3) WAP to find frequency of user defined character in user defined String
      a. i.e. User String :- “electrical engineering”
      b. i.e. User Char:-
 */
public class FrequencyOfCharacterInString {

	static void frequencyOfCharacter(String str, char ch) {
		int characterCountIncrease = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i))
				characterCountIncrease++;
		}

		System.out.println("User String is:->  " + str + " and User Character is " + ch + " and count of character-> "
				+ ch + " is " + characterCountIncrease);
	}

	public static void main(String[] args) {
		String str = "electrical engineering";
		char characterCount = 'e';
		frequencyOfCharacter(str, characterCount);
	}
}
