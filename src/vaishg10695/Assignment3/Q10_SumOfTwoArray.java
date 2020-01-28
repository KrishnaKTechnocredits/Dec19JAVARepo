/*10) WAP to sum of two array 
 * a. firstArray :- {1, 5, 9, 3, 7} 
 * b. secondAraay:- {1, 7,  9, 3} c. output :- 45
 */

package vaishg10695.Assignment3;
import java.util.Scanner;
public class Q10_SumOfTwoArray {

	int[] SetArray() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter array element: ");

			arr[i]=sc.nextInt();
		}
		return arr;
		}
	
	void SumOfArray(int[] a1,int [] a2)
	{
		int sum=0;
		for(int i=0;i<a1.length;i++)
		{
			 sum=sum+ a1[i];
		}
		
		for(int i=0;i<a2.length;i++)
		{
			 sum=sum+ a2[i];
		}
			System.out.print("Sum of two array is: "+sum);

	}
	
	public static void main(String[] args) {
		
		
		Q10_SumOfTwoArray s=new Q10_SumOfTwoArray();
		
		int[] arr1=s.SetArray();
		int[] arr2=s.SetArray();
		s.SumOfArray(arr1, arr2);
	}

}
