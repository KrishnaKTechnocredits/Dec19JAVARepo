/*5)Write a java program to find second largest element in an array of integers?*/

package vaishg10695.Assignment2;

public class SecondLargest 
{
	void SecLargest(int[] a)
	{int max1=0;
	int max2=0;
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
				max1=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=max1 && a[i]>max2)
				max2=a[i];
				
		}
		System.out.println(max2);
	}

	public static void main(String[] args) 
	{
		SecondLargest SL=new SecondLargest();
		int arr[]= {5,2,3,1,9};
		SL.SecLargest(arr);
	}

}
