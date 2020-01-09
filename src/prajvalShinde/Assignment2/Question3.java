package prajvalShinde.Assignment2;

public class Question3 {
	void displayNum (int digit, int[] num)
	{
		String flag ="H";
		for(int i=0;i<num.length;i++)
		{
			if(digit==num[i])
			{
				System.out.println("Numbers present in array");
				flag="J";
			}
			
		}
		if(flag=="H")
		{
			System.out.println("Nmbers not present in array");
		}
	}
	public static void main(String[] args) {
		Question3 input = new Question3();
		int[] arr = {2,5,9,7,4,6};
		input.displayNum(8, arr); 
	}

}
