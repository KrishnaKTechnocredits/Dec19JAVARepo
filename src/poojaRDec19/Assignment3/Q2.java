package poojaRDec19.Assignment3;
/*
 * 2) WAP to find max length String from the given array. a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
 */

public class Q2 
{

	int b; 
	String s;
	void length(String a[])
	{
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i].length()>b)
			{
				b=a[i].length();
				s=a[i];
			}
			
		}
		System.out.println(s);
	
	}

	public static void main(String[] args) 
	{
		Q2 q2=new Q2();
		String a[]= {"techno","helloHello","poojaRaut"};
		q2.length(a);
	}

}
