package poonamDDec19Assignment2;
/*
 *  Check if array contains a number in Java
 */

public class Q3_ContainsNum {
	static void findArrayContainNum(int[] arr,int num)
	{
		boolean flag= true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=num)
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
			System.out.println("Array contains number "+num );
		else
			System.out.println("Array doesn't contain number " + num );
			
	}
	public static void main(String[] args)
	{
		int[] input= {2,4,6,0,5,4};
		int number= 7;
		findArrayContainNum(input, number);
	}

}
