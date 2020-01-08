
/*3) Write a program to print the sum of all the element of an array of size having N.
 Hint:  
 Input:   int []array = {6, 3, 8,} 
 Output:  17 */

package vaishg10695.Assignment1;

class Array_of_n
{
	void Array_sum(int[]num)
	{
		int total=0;
		
		for(int i=0;i<num.length;i++)
		{
		   total=total+num[i];	
		}
		System.out.println("Sum of given array is: "+total);
	}
	
	
	public static void main(String[] args)
	{
		Array_of_n AN=new Array_of_n();
		int[] arr= {6,3,8};
		AN.Array_sum(arr);
	}
}