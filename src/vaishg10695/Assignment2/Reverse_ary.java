/*13) WAP to reveres array 
 * a. int inputArray = {5, 6, 9, 10, 14, 63}
 * b. outputArray = {63, 14, 10, 9, 6, 5}*/

package vaishg10695.Assignment2;

public class Reverse_ary 
{
	void aryReverse(int[]a)
	{
		System.out.println(); 
		System.out.println("Reverse array is: ");
		
		for (int i = a.length-1; i >= 0; i--) 
			System.out.print(a[i]+" ");

	}

	public static void main(String[] args) 
	{
		Reverse_ary ra=new Reverse_ary();
		int[] ary = {5, 6, 9, 10, 14, 63};
		System.out.println("orignal array is: ");
		for(int i=0; i<ary.length;i++)
			System.out.print(ary[i]+" ");
		ra.aryReverse(ary);
	}

}
