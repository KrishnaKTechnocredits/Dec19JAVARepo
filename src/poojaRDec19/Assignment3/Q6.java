package poojaRDec19.Assignment3;
//6) WAP to find reverse max length string  a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} b. Output Max length string :- Technocredits c. Max length string reverse value :- stiderconhcet 
import java.util.*;
public class Q6 {

	int b; 
	String s,rev="";
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
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse String :"+rev);
	}
	public static void main(String[] args) 
	{
		Q6 q6=new Q6();
		String a[]= {"techno","helloHello","poojaRaut"};
		q6.length(a);

	}

}
