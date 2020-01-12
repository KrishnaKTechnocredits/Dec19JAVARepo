package sameerDDec19.assignment1;

class Array
{
	public static void main(String[] args)
	{
		Array a1=new Array();
		int[] num=new int[4];
		num[0]=5;
		num[1]=4;
		num[2]=6;
		num[3]=7;
		
		a1.sum(num);
		
	}
	void sum(int[] input)
	{
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		System.out.println("The sum is :"+sum);
	}
}