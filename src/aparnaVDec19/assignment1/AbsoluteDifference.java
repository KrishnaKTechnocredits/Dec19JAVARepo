package aparnaVDec19.assignment1;
//7. You are given two numbers N and M , Print the Absolute difference between two numbers
//Approach-Therefore , if the value is negative then make it positive by multiplying it with -1 .Print out the value of result.
class AbsoluteDifference
{
 void difference(int x, int y)
	{
		int result=x-y;
		if(result<0)
		{
			result=result*(-1);
		}                           
		System.out.println(result);	
	}
	public static void main(String[] args)
	{
		AbsoluteDifference ab=new AbsoluteDifference();
		ab.difference(8,12);//value of this operation=8-12=-4=4	
	}
}