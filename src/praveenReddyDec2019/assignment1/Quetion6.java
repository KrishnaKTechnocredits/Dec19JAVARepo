package praveenReddyDec2019.assignment1;
class Quetion6  //2 Arrays sum
{
	static void twoArrays()
	{
		int[] num1={3,9,8};
		int[] num2={8,12,74};
		//int length=num1.length;
	//	int[] sum=new int[length];
		for (int i=0; i<=num1.length-1;i++)
		{
			int sum=0;
			sum=num1[i]+num2[i];
			//sum[i]=num1[i]+num2[i];
		    System.out.println("Sum of Array " + sum);
		} 
	}
	public static void main(String[] args)
	{
		twoArrays();
	}
	
}