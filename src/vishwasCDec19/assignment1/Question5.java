package vishwasCDec19.assignment1;
/*
 * Write a program to list all the integers between two integers start and end(including start and end).
 * Input: start = 5, end = 10
 *Output: 5 6 7 8 9 10
 */

public class Question5 {

void display(int start,int end)
{

		 for(int i=start;i<=end;i++)
		{
			System.out.println(i);
				
	   }
		 
		
}
			  		  
public static void main(String[] args)
	{
	Question5 l=new Question5();
		l.display(25,35);
	}
	}
