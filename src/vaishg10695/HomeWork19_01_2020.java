/*String s = "213hs.[][$%&ABF";
		//1. Capitals letters			//2. Digit
										//.a Odd Number sum
		//3. Special characters			//4. Even Number sum 	//5. Small characters
		
		//Output
		//ABF4.[][$%&2hs*/

package vaishg10695;

public class HomeWork19_01_2020 {

	static void displayString(String s) {
		String capitalLet = "";
		String specialChar = "";
		String smallLet = "";
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < s.length(); i++) {
			String ch = "";

			if (Character.isUpperCase(s.charAt(i))) {
				capitalLet = capitalLet + s.charAt(i);
			} else if (Character.isLowerCase(s.charAt(i))) {
				smallLet = smallLet + s.charAt(i);
			} else if (Character.isDigit(s.charAt(i))) {
				ch = ch + s.charAt(i);
				if (Integer.parseInt(ch) % 2 == 0)
					evenSum = evenSum + Integer.parseInt(ch);
				else
					oddSum = oddSum+Integer.parseInt(ch);
			} else {
				specialChar = specialChar + s.charAt(i);
			}
		}
		
		System.out.println("final output is: ");
		System.out.println("total capital letters: "+capitalLet);
		System.out.println("odd number sum: "+oddSum);
		System.out.println("special character: "+specialChar);
		System.out.println("small letter :"+smallLet);
		System.out.println("even num sum is: "+evenSum);
	}

	public static void main(String[] args) {

		String str = "v2a2!ishN95AV&*$i"; // s=vaishi cap=NAV specChar= 1&*$ evenSum=4 oddSum=14 
		System.out.println("Given string is: "+ str);
		displayString(str);
	}

}
