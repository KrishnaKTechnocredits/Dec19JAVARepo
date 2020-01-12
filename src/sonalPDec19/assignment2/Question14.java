package sonalPDec19.assignment2;
/*
 * WAP to print even number from the array 
 * int a = {15, 24, 52, 49, 62, 10};
 * output :- {24, 52, 62, 10} 
 */
public class Question14 {
	static void findEven(int[] input)
	{
		for(int i=0; i<input.length; i++)
		{
			if(input[i]%2 == 0)
			System.out.print(input[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {15, 24, 52, 49, 62, 10};
		findEven(input);
	}
	
}