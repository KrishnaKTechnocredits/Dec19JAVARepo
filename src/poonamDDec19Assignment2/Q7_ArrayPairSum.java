package poonamDDec19Assignment2;
/*
 * Find all pairs on integer array whose sum is equal to given number
 */
public class Q7_ArrayPairSum {
	static void sumOfNumPair(int[] arr, int sum) {

		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i; j < arr.length; j++)
			{
				if ((arr[j] +arr[i]) == sum)
				System.out.println("Integer numbers, whose sum is equal to " + sum + " are: (" + arr[i] + " , "
							+ arr[j] + ")");
			}
		}
	}
	public static void main(String[] args) {

		int[] input = { 2, 4, 3, 5, 7, 8, 9 };
		int sum = 9;
        sumOfNumPair(input, sum);
	}

}
