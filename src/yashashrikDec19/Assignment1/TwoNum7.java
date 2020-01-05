package yashashrikDec19.Assignment1;
class TwoNum7
{
	int finalNumber=0;
	void subTwoNum(int x,int y)
	{
		if(x<y)
		{
			finalNumber=(x-y)*(-1);
			System.out.println(finalNumber);
		}
		else 
		{
			finalNumber=x-y;
			System.out.println(finalNumber);
		}
	}
	public static void main(String args[])
	{
		TwoNum7 twoanum=new TwoNum7();
		twoanum.subTwoNum(4,5);
	}
}