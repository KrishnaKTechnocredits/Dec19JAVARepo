package rohiniBDec19.Assignment1;

/*
 5) Write a program to list all the integers between two integers start and end(including start
and end).
Hint:
Input: start = 5, end = 10
Output: 5 6 7 8 9 10
*/

class DisplayIntegers
{ 
   public static void main(String[] args)
   {
	   DisplayIntegers d1 =new DisplayIntegers();
	   d1.display(5,10);
   }
   
   void display(int start,int end)
   {
	   for(int i=start;i<=end;i++)
	   {
		   System.out.print(i+"\t");
	   }
   }
	
}