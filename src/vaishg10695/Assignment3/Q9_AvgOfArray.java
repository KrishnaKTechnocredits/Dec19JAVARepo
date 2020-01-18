/*9) WAP to find average of user given array 
 * a. Input :- {14, 32, 19, 14, 78,36} 
 * b. Output:- 32.16*/


package vaishg10695.Assignment3;
import java.util.Scanner;
public class Q9_AvgOfArray {

	
	void ArrayAverage(int[] a)
	{
		int len= a.length;
		float sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float avg=sum/len;
		System.out.println("Average of entered elements is : "+avg);

	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter length of array: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the array element : ");
			arr[i]=sc.nextInt();
		}
		
		Q9_AvgOfArray avg=new Q9_AvgOfArray();
		avg.ArrayAverage(arr);

	}

}
