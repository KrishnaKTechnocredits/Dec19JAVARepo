package aparnaVDec19.assignment3;

/*
 * 8) WAP to find vowels in given string
     a. Input :- automation engineering
     b. Count :- 11
 */
public class FindVowelsInString {

	static void findVowelsCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Count of total vowels in a Given String:-> " + str + "  is  : " + count);
	}

	public static void main(String[] args) {
		String str = "automation engineering";
		findVowelsCount(str);
	}
}
