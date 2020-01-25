/*12) WAP to print common number from two different array 
 * a. int array1 = {1, 3, 6, 9, 7}
 * b. int array2 = {2, 5, 6, 9, 8} 
 * output Array :- {6, 9} */

package vaishg10695.Assignment2;

public class Q12commonNumber {
	void comNum(int[] a1, int[] a2) {
		if (a1.length != a2.length)
			System.out.println("given two array are not equal");
		else {
			for (int i = 0; i < a1.length; i++)
				if (a1[i] == a2[i]) {
					System.out.println("common values is ->" + a1[i]);
					return;
				}
		}
	}

	public static void main(String[] args) {
		Q12commonNumber cn = new Q12commonNumber();
		int[] ary1 = { 1, 3, 6, 9, 7 };
		int[] ary2 = { 2, 5, 6, 5, 8 };
		cn.comNum(ary1, ary2);
	}

}
