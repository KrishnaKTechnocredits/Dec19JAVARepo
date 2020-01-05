package aparnaVDec19.assignment1;
//6. write a program to add the corresponding elements of two array , each of sie N and print the sums. N can be any integer between 1 and 100.
//1<=N<=100
//Hint
//Input :int input1[]	={3,9,8}
//int input2[]= {8,12,74}
//output : 11,21, 82.
class AddTwoArrays
{
	void sumOfTwoArrays(int[] num1, int[] num2)
	{    
		for(int i=0; i<num1.length;i++)
	      {
			  for(int j=0; j<num2.length;j++) 
			 {
			 if (i==j)
			 {
				int sum=0;
              sum=num1[i]+num2[j];
              System.out.println(sum);					
			 }
			 }
		  }
	}
	public static void main(String[] args)
	{
		AddTwoArrays addarr=new AddTwoArrays();
		int[] num1={3,9,8};
		int[] num2={8,12,74};
		addarr.sumOfTwoArrays(num1, num2);
	}
}
