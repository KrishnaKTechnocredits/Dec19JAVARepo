
/*4) Write a program to print the sum of element’s squares of an array having size of N. 
      Hint: 
      Input:   int[] array = 4 7 2 8 5 
	  Output:  158 */

package vaishg10695.Assignment1;  
	  
class Array_square_sum
{
	
		void Array_sum(int[]num)
	{
		int total=0;
		
		for(int i=0;i<num.length;i++)
		{
		   total=total+(num[i]*num[i]);
		}
		System.out.println("sum of elements squares of an array : "+total);
	}
	
	
	public static void main(String[] args)
	{
		Array_square_sum AS=new Array_square_sum();
		int[] arr= {4,7,2,8,5};
		AS.Array_sum(arr);
	}
}
