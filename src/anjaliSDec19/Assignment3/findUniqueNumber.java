/*
 * WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5}
b. secondArray:- {5,6,7,8,9,7}
c. unique array = {1,2,3,4,5,6,7,8,9}
i. order can be anything 
 */
package anjaliSDec19.Assignment3;

import java.util.Scanner;

public class findUniqueNumber {
	Scanner scan = new Scanner(System.in);
	int[] sortArray(int[] arr)
	{
		int temp=0;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	int[] mergeArray(int[] arr1, int[] arr2)
	{
		int cnt=arr1.length+arr2.length;
		int[] arr3 = new int[cnt];
		
		for(int i=0; i<arr1.length;i++)
		{
			arr3[i]= arr1[i]; 
		}
			
		for(int j=arr1.length; j<arr3.length;j++)
		{
			arr3[j]=arr2[j-arr1.length];
		}
		return arr3;
	}
		
	void getArray(int[] arr)
	{
		System.out.print("Array is : ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	int[] setArray()
	{
		
		System.out.println("Enter lenght of array:");
		int len = scan.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array elements: ");
			arr[i]=scan.nextInt();
		}
		return arr;
	}
		
	public static void main(String[] args) {
		findUniqueNumber obj = new findUniqueNumber();
		int[] arr1= obj.sortArray(obj.setArray());
		int[] arr2= obj.sortArray(obj.setArray());
		
		int[] arr3 = obj.mergeArray(arr1, arr2);
		//int[] arr4 = obj.findUniqueArray(obj.sortArray(arr3));
		obj.getArray(obj.sortArray(arr3));
	}
}
/*
int[] findUniqueArray(int[] arr)
{
	int[] arr1= new int[arr.length]; 
	for(int j=0;j<arr.length;j++)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]!=arr[i+1])
				arr1[j]=arr[i];
			i=i+2;
		}
		//return -1;
	}return arr1;
}







for(int i=0; i<arr1.length;i++)
{
	arr3[i]= arr1[i]; 
}
	
for(int j=arr1.length; j<arr3.length;j++)
{
	arr3[j]=arr2[j-arr1.length];
}
	
for(int i=0;i<arr3.length;i++)
{
	for(int j=i+1;j<arr3.length;j++)
	{
		if(arr3[i]>arr3[j])
		{
			c=arr3[i];
			arr3[i]=arr3[j];
			arr3[j]=c;
		}
	}
}
for(int i=0;i<arr3.length;i++)
{
	for(int j=i+1;j<arr3.length;j++)
	{
		if(arr3[i]==arr3[j])
		{
			
		 	j++;
		}
	}
}
return arr3;
}*/
