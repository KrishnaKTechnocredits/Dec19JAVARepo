/*11) WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
reverse of actual number :- 12321*/
package ankitaPDec19.Assignment3_1;

public class Solution11 {
	static String str = "";

	public static void main(String[] args) {
		int num = 12321;
		String s = String.valueOf(num);
		pallindrome(s);
		if (num == Integer.parseInt(str))
			System.out.println("The number is a paalindrome " + num);
	}

	static String pallindrome(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.valueOf(s.charAt(i));
		}
		return str;
	}
}
