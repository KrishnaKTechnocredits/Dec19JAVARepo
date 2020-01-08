package aparnaVDec19.assignment1;
//2. write a program to print the sum of all elements of an array of size 4.

class ArraySumLengthFour
{
	void sumArray(int[] num)
	{    
	    int totalSum=0;
		for(int i=0; i<num.length;i++)
	{
		totalSum=totalSum+num[i];
	}
	System.out.println("Sum of all elements of an array of size 4 is equals to : " + totalSum);//print value as 100
	}
	public static void main(String[] a)
	{
	ArraySumLengthFour as1=new ArraySumLengthFour();
	int[] num= new int[4];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	as1.sumArray(num);//answer of this operation is 10+20+30+40=100
   }
}