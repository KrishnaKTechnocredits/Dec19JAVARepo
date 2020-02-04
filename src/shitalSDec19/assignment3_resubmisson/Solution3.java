/*  WAP to find frequency of user defined character in user defined String 
 * a. i.e. User String :- “electrical engineering” 
 * b. i.e. User Char:- ‘e’ c. count of e :- 5  */

package shitalSDec19.assignment3_resubmisson;

public class Solution3 {
	void findFreq(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			// char ch = a.charAt(i);
			// if (ch == 'e')
			if (a.charAt(i) == 'e')
				count++;
		}
		System.out.println("Frequency of user defined string " + a + " is " + count);
	}

	public static void main(String[] args) {

		String s = "electrical engineering";
		Solution3 solution3 = new Solution3();
		solution3.findFreq(s);

	}

}
