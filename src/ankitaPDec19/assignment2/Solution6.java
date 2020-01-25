package ankitaPDec19.assignment2;
/* Write a java program to check the equality of two arrays?
Hint: Input Arrays : First Array : [21, 57, 11, 37, 24] Second Array : [21, 57, 11, 37, 24] Two Arrays Are Equal*/

public class Solution6 {
	
	public static void main(String [] args)
	{
		int [] a1 = {21, 57, 11, 37, 24};
		int [] a2 =  {21, 57, 11, 37, 24};
		Solution6 solution6 = new Solution6();
		solution6.checkequality(a1,a2);
	}
	 void checkequality(int [] a1, int [] a2)
	{
		 int flag = 0;
		 for (int i = 0; i<a1.length; i++)
		 {
			 if (a1[i] != a2[i])
			   flag = 1;
		 }if(flag == 0)
		 System.out.println("Two Arrays Are Equal");

		}
	}


