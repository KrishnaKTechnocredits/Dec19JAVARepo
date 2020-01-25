/*2) Find duplicate number on Integer array in Java? 
 Hint: There is exactly one number is repeated in the array. You need to write a program to find that duplicate number. For example, if an array with 
length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3 */

package vaishg10695.Assignment2;

public class Duplicate {
	void duplicateNumber(String n) {
		for (int i = 0; i < n.length(); i++) // start traveling from 1st element
			for (int j = i + 1; j < n.length(); j++) { // start traveling from 2nd element
				if (n.charAt(i) == n.charAt(j))
					System.out.println("Duplicate number is: " + n.charAt(i));
			}
	}

	public static void main(String[] args) {
		Duplicate dub = new Duplicate();
		String num = "4031234";
		dub.duplicateNumber(num);
	}

}
