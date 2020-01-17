/*5) WAP to reveres user given number 
 * a. Input number:- 456789 
 * b. Output number :- 987654 */

package vaishg10695.Assignment3;
import java.util.Scanner;
public class Q5_Reverse {
	
	void StringRev(int[] n)
	{
		for(int i=n.length-1;i>=0;i--)	//reverse string
		{
			System.out.print(n[i]+" ");

		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int size=sc.nextInt();
		int [] num= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter Number : ");
			num[i]=sc.nextInt();
		}
		
		Q5_Reverse rev=new Q5_Reverse();
		rev.StringRev(num);

	}

}
