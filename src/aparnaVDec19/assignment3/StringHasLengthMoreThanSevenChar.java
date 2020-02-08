package aparnaVDec19.assignment3;

/*
 * 15) WAP to find string which has length more than 7characheter.
      a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}
      b. Output :- Krishna, aakansha, abhishek
 */
public class StringHasLengthMoreThanSevenChar {
	static void findstringHasLengthMoreThan7Char(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() >= 7) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		System.out.println("String Whose Length is more than 7 characters:-> ");
		findstringHasLengthMoreThan7Char(str);
	}
}
