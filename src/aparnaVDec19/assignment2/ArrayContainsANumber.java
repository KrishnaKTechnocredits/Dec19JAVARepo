package aparnaVDec19.assignment2;
/*
 * 3) Check if array contains a number in Java?
      Hint: Your method should accept 2 parameters. Input array and number.
      i/p :- arr[] = {2,5,9,7,4,6}
      number :- 8
      o/p :- number is not in arr.
 */
public class ArrayContainsANumber {
	
	static void numberPresent(int[] arr, int number)
	{
		boolean flag=false;
		//when number is present in array
		for(int i=0;i<arr.length;i++)
		{
		if(number==arr[i])
		{
		 flag=true;
	     System.out.println("The Number Contains in Array:->" + number);
	     break;
		}
		}
		//when  number is not present in array
		if(flag==false)
		{
			System.out.println("The Number does not Contain in Array:->" + number);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr={2,5,9,7,4,6};
		int number=8;
		numberPresent(arr,number);
	}
}
