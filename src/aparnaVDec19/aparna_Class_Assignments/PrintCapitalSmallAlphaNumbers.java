package aparnaVDec19.aparna_Class_Assignments;

/*
 * String s = "213hs.[][$%&ABF";
		
		//1. Capitals letters
		//2. Digit
			//.a Odd Number sum
		//3. Special characters
		//4. Even Number sum 
		//5. Small characters
		
		//Output
		//ABF4.[][$%&2hs
 * 
 */
public class PrintCapitalSmallAlphaNumbers {

	static void printCapitalSmallAlphaNumberNOddEvenSum(String str) {
		String smallCharacters = "";
		String CapitalCharacters = "";
		String specialCharacters = "";
		int oddNumberSum = 0;
		int evenNumberSum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				CapitalCharacters = CapitalCharacters + ch;
			} else if (Character.isLowerCase(ch)) {
				smallCharacters = smallCharacters + ch;
			} else if (Character.isDigit(ch)) {

				if (Integer.parseInt(String.valueOf(ch)) % 2 == 0)
				{
					evenNumberSum = evenNumberSum + Integer.parseInt(String.valueOf(ch));
				}
				else
				{
					oddNumberSum = oddNumberSum + Integer.parseInt(String.valueOf(ch));
				}
			} else {
				specialCharacters = specialCharacters + ch;
			}
		}
		System.out.println("Output of Whole String is as such:-> " + CapitalCharacters + oddNumberSum
				+ specialCharacters + evenNumberSum + smallCharacters);
	}

	public static void main(String[] args) {
		String str = "213hs.[][$%&ABF";
		printCapitalSmallAlphaNumberNOddEvenSum(str);

	}
}
