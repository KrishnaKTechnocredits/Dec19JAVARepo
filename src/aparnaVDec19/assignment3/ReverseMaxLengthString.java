package aparnaVDec19.assignment3;

/*
 * 6) WAP to find reverse max length string
      a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
      b. Output Max length string :- Technocredits
      c. Max length string reverse value :- stiderconhcet
 */
public class ReverseMaxLengthString {

	static void findMaxStringName(String[] str) {
		String maxLengthName = "";
		int maxLength = 0;
		String reverse = "";
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > maxLength) {
				maxLength = str[i].length();
				maxLengthName = str[i];
			}
		}
		System.out.println("Output Max length string is: " + maxLengthName);

		for (int j = maxLength - 1; j >= 0; j--) {
			reverse = reverse + maxLengthName.charAt(j);
		}
		System.out.print("Max length String Reverse Value is :-> " + reverse);
	}

	public static void main(String[] args) {
		String str[] = { "all the best", "Technocredits", "maharashtra" };
		findMaxStringName(str);
	}
}
