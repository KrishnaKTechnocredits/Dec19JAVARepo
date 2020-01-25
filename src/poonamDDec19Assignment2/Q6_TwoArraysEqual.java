package poonamDDec19Assignment2;
/*
 * Write a java program to check the equality of two array
 */
public class Q6_TwoArraysEqual {
	static void findEqulaityOfArray(int[] arr1,int[] arr2)
	{
		for (int i=0;i<arr1.length;i++)
		{
				if(arr1[i]==arr2[i])
					System.out.println(arr1[i] +" and "+arr2[i]+" are equal");
				
				else 
					System.out.println("both the arrays are not equal");
		}
	}
	public static void main(String[] args)
	{
		int[] input1= {21, 57, 11, 37, 24};
		int[] input2= {21, 57, 11, 37, 24};
		findEqulaityOfArray(input1, input2);
	}
	

}
