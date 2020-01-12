package amitJDec19.assignment1;
/*
 * Write a program to print the sum of all the elements of an array of size 4.
 */
public class Question2 {
	void sumArrayWithSize(int[] num)
	{    
	    int totalSum=0;
		for(int i=0; i<num.length;i++)
	{
		totalSum=totalSum+num[i];
	}
	System.out.println("Sum of all the elements of an array of size 4 is: " + totalSum);
	}
	public static void main(String[] args)
	{
	Question2 m1=new Question2();
	int[] num= new int[4];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	m1.sumArrayWithSize(num);
   }
}
