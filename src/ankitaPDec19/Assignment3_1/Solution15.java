/*15) WAP to find string which has length more than 7characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}
b. Output :- Krishna, aakansha, abhishek*/
package ankitaPDec19.Assignment3_1;

public class Solution15 {
	public static void main(String[] args) {
		String[] str = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		Solution15 solution15 = new Solution15();
		solution15.length(str);
	}

	void length(String[] str) {
		int length = 0;
		String s = "";
		for (int i = 0; i < str.length; i++) {
			length = str[i].length();
			if (length >= 7) 
			{
				s = str[i];
				System.out.print(s + ",");
			}
		}
	}

}
