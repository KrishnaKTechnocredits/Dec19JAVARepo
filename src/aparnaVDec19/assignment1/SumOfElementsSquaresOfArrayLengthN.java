package aparnaVDec19.assignment1;
//4. write a program to print the sum of  element's squares of an array having size of N.
//Hint:---
//Input  int[] array={4,7,2,8,5}
//output 	=158(4x4=16+7x7=49+2x2=4+8x8=64+5x5=25=16+49+4+64+25=158)
class SumOfElementsSquaresOfArrayLengthN
{
	void squareSum(int[] num)
	{    
	    int totalSum=0;
		for(int i=0; i<num.length;i++)
	{
		totalSum=totalSum+(num[i]*num[i]);
	}
	System.out.println("sum of  element's squares of an array having size of 5 : " + totalSum);
	}
	public static void main(String[] a)
	{
	SumOfElementsSquaresOfArrayLengthN as1=new SumOfElementsSquaresOfArrayLengthN();
	int[] num={4,7,2,8,5};//answer of this operation is 158
	as1.squareSum(num);
   }
}
