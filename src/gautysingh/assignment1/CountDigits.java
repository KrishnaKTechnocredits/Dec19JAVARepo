package gautysingh.assignment1;

public class CountDigits {

	public static int digitCount = 0;
	public static int digit_0 = 0;
	public static int digit_1 = 0;
	public static int digit_2 = 0;
	public static int digit_3 = 0;
	public static int digit_4 = 0;
	public static int digit_5 = 0;
	public static int digit_6 = 0;
	public static int digit_7 = 0;
	public static int digit_8 = 0;
	public static int digit_9 = 0;


	public static void main(String[] args) {
		//System.out.println("hi dear user, please enter a string :> ");
		//Scanner sc = new Scanner(System.in);
		String str = "12345656";
		//System.out.println("str :" + str);

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// System.out.println(c);
			/*
			 * if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { VOWEL_COUNT
			 * += 1; }
			 */

			if (c == '0') {
				digitCount++;
				digit_0 ++;
			} else if (c == '1') {
				digitCount++;
				digit_1 ++;
			} else if (c == '2') {
				digitCount++;
				digit_2 ++;
			}else if (c == '3') {
				digitCount++;
				digit_3 ++;
			}else if (c == '4') {
				digitCount++;
				digit_4 ++;
			}else if (c == '5') {
				digitCount++;
				digit_5 ++;
			}else if (c == '6') {
				digitCount++;
				digit_6 ++;
			}else if (c == '7') {
				digitCount++;
				digit_7 ++;
			}else if (c == '8') {
				digitCount++;
				digit_8 ++;
			}else if (c == '9') {
				digitCount++;
				digit_9 ++;
			}

		}
		System.out.println("Total Digit  : " + digitCount);
		System.out.println("Digit 0 : " + digit_0);
		System.out.println("Digit 1 : " + digit_1);
		System.out.println("Digit 2 : " + digit_2);
		System.out.println("Digit 3 : " + digit_3);
		System.out.println("Digit 4 : " + digit_4);
		System.out.println("Digit 5 : " + digit_5);
		System.out.println("Digit 6 : " + digit_6);
		System.out.println("Digit 7 : " + digit_7);
		System.out.println("Digit 8 : " + digit_8);
		System.out.println("Digit 9 : " + digit_9);

	}

}