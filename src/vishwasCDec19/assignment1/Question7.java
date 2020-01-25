package vishwasCDec19.assignment1;

/*
 * You are given two numbers N and M, print the absolute difference between two numbers
 */

public class Question7 
{
        void display(int n1,int n2)
		{
			int d=0;
			d=n1-n2;
			if(d<0)
			{
				d=d*(-1);
			}
			System.out.println("The difference is "+d);
		}
		public static void main(String[] args)
		{
			Question7 d1=new Question7();
			d1.display(10,5);
			
		}
	}
