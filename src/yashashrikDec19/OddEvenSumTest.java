package yashashrikDec19;
/*accept numbers through arguments and print sum of odd value and sum of even value*/

public class OddEvenSumTest {

	static void findEvenOddSum(String[] data)
	{
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<data.length;i++)
		{
			int num=Integer.parseInt(data[i]);
			if(num%2==0)
			{
			evenSum=evenSum+Integer.parseInt(data[i]);
			
			}else
			{
				oddSum=oddSum+Integer.parseInt(data[i]);
				
			}
			
		}
		System.out.println("Even Sum "+evenSum);
		System.out.println("Odd Sum "+oddSum);
	}
	
	public static void main(String[] args) {
		
	findEvenOddSum(args);

	}
}
