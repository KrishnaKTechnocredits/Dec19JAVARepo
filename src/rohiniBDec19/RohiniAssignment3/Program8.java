package rohiniBDec19.RohiniAssignment3;

/*8) WAP to find vowels in given string  a. Input :- automation engineering b. Count :- 11 */

class Program8 {
	static int acount = 0;
	static int ecount = 0;
	static int icount = 0;
	static int ocount = 0;
	static int ucount = 0;

	public static void main(String[] args) {
		findVowels();
		System.out.println(
				"Count of vowels are a:" + acount + " e:" + ecount + " i:" + ecount + " o:" + ocount + " u:" + ucount);
	}

	private static void findVowels() {

		String str = "automation engineering ";
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {

			case ('a' | 'A'):
				acount++;
				break;
			case ('e' | 'E'):
				ecount++;
				break;
			case ('i' | 'I'):
				icount++;
				break;
			case ('o' | 'O'):
				ocount++;
				break;
			case ('u' | 'U'):
				ucount++;
				break;
			// default:
			// System.out.println("Case not matched");

			}

		}

	}
}
