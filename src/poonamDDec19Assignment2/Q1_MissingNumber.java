package poonamDDec19Assignment2;
/*
 * Find the missing number in integer array of 1 to 10
 */
public class Q1_MissingNumber {
	static void findMissingNum(int[] arr)
	{
		boolean flag=true;
		int i;
		for( i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				flag=false;
				System.out.println("Missing number is "+i);
				break;
			}
			
		}
			if(flag==true)
			{
				System.out.println(arr[i]);
			}
		
	}
	public static void main(String[] args)
	{
		int[] input= {1,2,3,4,6,8,9,10};
		findMissingNum(input);
	}

}
