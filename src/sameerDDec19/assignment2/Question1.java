package sameerDDec19.assignment2;
/*
*
*Find the missing number in integer array of 1 to 10
*
*/
class Question1
{
	void number(int[] input)
	{
		int n;
		int expsum=0;
		for(int i=1;i<=10;i++)
		{
			expsum=expsum+i;	
		}
		//System.out.println(expsum);
		int sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		//System.out.println(sum);
		n=expsum-sum;
		System.out.println("The missing Number is "+n);
	}
	public static void main(String[] args)
	{
		Question1 q1=new Question1();
		int [] a = new int[10];
		int b[] ={1,2,3,4,5,6,8,9,10};
		q1.number(b);
		
	}
}