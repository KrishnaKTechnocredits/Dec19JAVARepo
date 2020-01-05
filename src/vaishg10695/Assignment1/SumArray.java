
/*2) Write a program to print the sum of all the elements of an array of size 4.*/

package vaishg10695.Assignment1;

class SumArray
{
	
	void ArySum(int[]arr)
	{
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
		  total= total + arr[i];
		}
				 System.out.println("sum of integer number array is: "+ total); 

		//System.out.println("sum is:" + (num[0]+num[1]+num[2]+num[3]));

	}
	
	public static void main(String[] args)
	{
		SumArray SA=new SumArray();
		int[] num=new int[4];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		SA.ArySum(num);		
		
	}
}