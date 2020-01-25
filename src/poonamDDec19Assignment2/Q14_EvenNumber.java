package poonamDDec19Assignment2;
/*
 * WAP to print even number from the array 
 */
public class Q14_EvenNumber {
	static void findEvenNum(int [] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
				System.out.println(arr[i]+" is even number");
		}
	}
	public static void main(String[] args)
	{
		int[] input= {33,48,54,77,38};
		findEvenNum(input);
		}
}

