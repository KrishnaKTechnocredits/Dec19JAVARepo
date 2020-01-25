package poonamDDec19Assignment2;

public class Q2_DuplicateNum {
	static void findDuplicateInt(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println ("Duplicate number in array is: "+ arr[i]);
				break;
			   }
			}
		}	
	}
	public static void main(String[] args)
	{
		int[] input= {2,6,2,7,8,6,8};
		findDuplicateInt(input);
	}
}
