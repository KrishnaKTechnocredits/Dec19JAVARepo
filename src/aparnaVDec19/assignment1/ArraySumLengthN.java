package aparnaVDec19.assignment1;
//3. write a program to print the sum of all elements of an array of size having N.
//Hint:---
//Input  int[] array={6,3,8}
//output 	=17 (6+3+8=17)

class ArraySumLengthN
{
	void sumArray(int[] num)
	{    
	    int totalSum=0;
		for(int i=0; i<num.length;i++)
	{
		totalSum=totalSum+num[i];
	}
	System.out.println("Sum of all elements of an array of size 10 is equals to : " + totalSum);//print value as 100
	}
	public static void main(String[] a)
	{
	ArraySumLengthN as1=new ArraySumLengthN();
	int[] num={1,2,3,4,5,6,7,8,9,10};//answer of this operation is 55
	as1.sumArray(num);
   }
}
