package prajvalShinde.Assignment2;

public class Question2 
{
	void displayDuplicateNo(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;i++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate number is"+num[i]);    // if duplicate print num[i]
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Question2 praj = new Question2();
		int[] num={0,4,2,2,4};
		praj.displayDuplicateNo(num);
		
	}

}

