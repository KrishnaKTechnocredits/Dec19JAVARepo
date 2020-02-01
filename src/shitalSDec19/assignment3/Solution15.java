/*  WAP to find string which has length more than 7 character. 
 * a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} 
 * b. Output :- Krishna, aakansha, abhishek  */

package shitalSDec19.assignment3;

public class Solution15 {

	void findName(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() >= 7)
				System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		Solution15 solution15 = new Solution15();
		solution15.findName(input);

	}
}
