package aparnaVDec19.assignment2;
/*
 *14) WAP to print even number from the array
      int a = {15, 24, 52, 49, 62, 10};
      output :- {24, 52, 62, 10}
 */
public class PrintEvenNumberFromArray {
	
	static void evenNumbersInArray(int[] number)
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2 ==0)
			{
				System.out.println(number[i]);
			}	
		}
	}
	public static void main(String[] args) { 
		int number[] ={15,24,52,49,62,10};
		evenNumbersInArray(number);	
	}
}

