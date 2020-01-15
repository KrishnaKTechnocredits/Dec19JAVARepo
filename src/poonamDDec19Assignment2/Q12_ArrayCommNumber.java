package poonamDDec19Assignment2;
/*
 *  WAP to print common number from two different array
 */
public class Q12_ArrayCommNumber {
	static void CommonNum(int [] arr1,int [] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				
			if(arr1[i]==arr2[j])
				System.out.println(arr1[i]);
			}
		}
	}
public static void main(String[] args)
{
	int[] input1= {1,3,6,9,7};
	int[] input2= {2,5,6,9,8};
	CommonNum(input1, input2);
	
	}

}
