/*14) WAP to print even number from the array
 *  int a = {15, 24, 52, 49, 62, 10}; 
 *  output :- {24, 52, 62, 10} */

package vaishg10695.Assignment2;

public class evenNum {
	void even(int[] a) {
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0) // to get even number
			{
				System.out.println(a[i] + " is Even");
			}
	}

	public static void main(String[] args) {
		evenNum en = new evenNum();
		int[] ary = { 15, 24, 52, 49, 62, 10 };
		en.even(ary);
	}

}
