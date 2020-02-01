package sonalPDec19.homeworkex;

 	//1. Capitals letters
		//2. Digit
			//.a Odd Number sum
		//3. Special characters
		//4. Even Number sum 
		//5. Small characters
		//Output
		//ABF4.[][$%&2hs
		 
public class SortElements {

	void doSorting(String str) {
		String capitalChar = "";
		String smallChar = "";
		String specialChar = "";
		int evenNoSum = 0;
		int oddNoSum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (Character.isLowerCase(str.charAt(i))) {
					smallChar = smallChar + str.charAt(i);
				} else {
					capitalChar = capitalChar + str.charAt(i);
				}
			} else if (Character.isDigit(str.charAt(i))) {
				if (Integer.parseInt(String.valueOf(str.charAt(i))) % 2 != 0) {
					oddNoSum = oddNoSum + Integer.parseInt(String.valueOf(str.charAt(i)));
				} else {
					evenNoSum = evenNoSum + Integer.parseInt(String.valueOf(str.charAt(i)));
				}

			} else {
				specialChar = specialChar + str.charAt(i);
			}
		}
		System.out.println(capitalChar + oddNoSum + specialChar + evenNoSum + smallChar);
	}

	public static void main(String[] args) {
		SortElements sortelements = new SortElements();
		sortelements.doSorting("213hs.[][$%&ABF");
	}

}
