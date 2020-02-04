/* WAP to find reverse max length string 
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
	b. Output Max length string :- Technocredits 
	c. Max length string reverse value :- stiderconhcet  */
package shitalSDec19.assignment3_resubmisson;

public class Solution6 {

	void findMaxLengthString(String[] arr) {
		String reverse = "";
		int maxLength = 0;
		String maxLengthName = "";
		for (int i = 0; i < arr.length; i++) {
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
				maxLengthName = arr[i];
			}
		}
		for (int j = maxLength - 1; j >= 0; j--) {
			reverse = reverse + maxLengthName.charAt(j);
		}
		System.out.println("output max length string is " + maxLengthName + " and its length is " + maxLength);
		System.out.println("Max length string reverse value " + reverse);
	}

	public static void main(String[] args) {
		String[] input = { "all the best", "technocredits", "", "maharashtra" };
		Solution6 solution6 = new Solution6();
		solution6.findMaxLengthString(input);

	}
}
