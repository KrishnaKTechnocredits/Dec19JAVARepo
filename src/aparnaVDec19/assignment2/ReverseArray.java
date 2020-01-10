package aparnaVDec19.assignment2;
/*
 * 13) WAP to reveres array
       a. int inputArray = {5, 6, 9, 10, 14, 63}
       b. outputArray = {63, 14, 10, 9, 6, 5}
 */
public class ReverseArray {

	static void reverseNumberInArray(int[] number)
	{
		for(int i=number.length-1;i>=0; i--)
		{
			System.out.println(number[i]);		
		}
		
	}
	public static void main(String[] args) { 
		int number[] ={5,6,9,10,14,63};
		reverseNumberInArray(number);		
	}
}

