package dipaPDec19.assignment2;
/*
 * Check if array contains a number in Java?
 * Hint: Your method should accept 2 parameters. Input array and number.
	i/p :- arr[] = {2,5,9,7,4,6}
	number :- 8
	o/p :- number is not in arr.  */

public class Question3 {

	public static void main(String[] args) {
		int[] arr = {2,5,9,7,4,6};
		int num = 8;
		checkNumber(arr, num);
		
}

	static void checkNumber(int[] a, int num) {
		
		boolean check = true;
		for(int i = 0; i <a.length;i++)
		{
			if(a[i] == num)
			{
				check = false;
				break;
			}
		}
		if(check == false)	 
			System.out.println("Number is present in array");
		else
			System.out.println("Number is not present in array");
			
	}
}
