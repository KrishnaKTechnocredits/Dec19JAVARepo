/* WAP to find vowels in given string  
 * a. Input :- automation engineering 
 * b. Count :- 11  */

package shitalSDec19.assignment3_resubmisson;

public class Solution8 {
	int count = 0;

	int findVowelsCount(String s) {
		// System.out.println("Input String");
		// Scanner sc = new Scanner(System.in);
		// String line1 = sc.next();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Solution8 solution8 = new Solution8();
		String s = "automation engineering";
		System.out.println("Vowels count in given string is " + solution8.findVowelsCount(s));
	}
}
