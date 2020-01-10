/*4) Largest and smallest number in unsorted array? 
Hint: For example, if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output should be {6,3}. */

package vaishg10695.Assignment2;

public class LargestSmallest 
{
	void larSmall(int[] a)
	{
		int max=0;
		int min=99999;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("largest value in array is: "+ max);
		System.out.println("smallest value in array is: "+ min);

	}
	public static void main(String[] args) 
	{
		LargestSmallest ls=new LargestSmallest();
		int[] ary= {15,6,3,11,9};
		ls.larSmall(ary);
		
	}

}
