package aparnaVDec19.assignment3;

/*
 * 2) WAP to find max length String from the given array.
     a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class FindMaxLengthStringFromArray {

	static private String findMaxStringName(String[] str) {

		// int maxLength = 0;//This increase one iteration more
		// To less than one iteration we have written int maxLength =
		// str[0].length();
		// and hence Int i get started with 1 instead of 0
		int maxLength = str[0].length();
		String maxLengthName = "";
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > maxLength) {
				maxLength = str[i].length();
				maxLengthName = str[i];
			}
		}
		return maxLengthName;
	}

	public static void main(String[] args) {

		String name = findMaxStringName(args);
		System.out.println(
				"Maximum name inside String is:-> " + "  " + name + "  " + "and length is:-> " + name.length());
	}
}
