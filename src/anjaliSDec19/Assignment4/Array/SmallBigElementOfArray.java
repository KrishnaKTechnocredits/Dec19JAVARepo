/*2.	Write a program to ask the size form the user and find the smallest and largest element in an array.
 * 
 */
package anjaliSDec19.Assignment4.Array;

import java.util.Scanner;

public class SmallBigElementOfArray {

	int[] setArray()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght of Array : ");
		int len = Integer.parseInt(scan.nextLine());
		int[] arr= new int[len];
		for(int i=0;i<len; i++)
		{
			System.out.print("Enter an array element : ");
			arr[i]=Integer.parseInt(scan.nextLine());
		}
		
		scan.close();
		return arr;
	}
	int[] sortArray(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
		}
		return arr;
	}
	void getArray(int[] arr)
	{
		for (int a:arr)
		{
			System.out.print(a);
		}System.out.println();
	}
	public static void main(String[] args) {
		SmallBigElementOfArray obj = new SmallBigElementOfArray();
		int[] arr=obj.setArray();
		int[]arr1=obj.sortArray(arr);
		System.out.println("Sorted array is : ");
		obj.getArray(arr1);
		System.out.println("Min value element is : "+arr1[0]+'\t'+"Max value element is : "+arr1[arr.length-1]);
	}
}
