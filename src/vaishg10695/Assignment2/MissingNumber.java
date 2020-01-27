/*1) Find the missing number in integer array of 1 to 10? 
Hint: You have given an integer array which contains numbers from 1 to 10 but one number is missing, you need to write a Java program to find that
 missing number in an array.*/

package vaishg10695.Assignment2;

public class MissingNumber {
	void mnumber(String n) {
		for (int i = 0; i < n.length()-1; i++) {
			if (n.charAt(i + 1) - n.charAt(i) != 1) {
				char ch = (char) (n.charAt(i) + 1);
				System.out.println("missing number form string is " + ch);
			}
		}
	}

	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		String num = "12346789";
		mn.mnumber(num);

	}

}
