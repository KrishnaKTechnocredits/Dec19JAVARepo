package prajvalShinde.Assignment2;

public class Question1 {
	void displayMissingNo(int[] num) 
	{
		for(int i=1;i<=10;i++)
		{
			String found = "p";
		for(int j=0;j<num.length;j++)
		{
			if(i==num[j])
			{
			found= "r";
			break;
			}
		}
		if (found =="p")
		{
			System.out.println(i);
		}
		}
	}
	
	public static void main(String[] args) 
	{
		Question1 num =new Question1();
		int[] arr={1,2,4,6,8,10};
		num.displayMissingNo(arr);
	}
}

