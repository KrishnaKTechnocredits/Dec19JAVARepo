/*3) Check if array contains a number in Java? 
 
Hint: Your method should accept 2 parameters. Input array and number.  
i/p :-  arr[] = {2,5,9,7,4,6}  number :- 8 o/p :- number is not in arr. */

package vaishg10695.Assignment2;

public class SearchNum 
{
	void searchNumber(String s, int n)
	{
		for(int i=0;i<s.length();i++)
		{
			if(n==s.charAt(i))
				System.out.println(n+" is found in string");
		}
		
		System.out.println(n+" is not found in string");

	}
	
	public static void main(String[] args) 
	{
		SearchNum sn=new SearchNum();
				String str= "259746" ;
				int num=8;
		sn.searchNumber(str,num);
	}
}
