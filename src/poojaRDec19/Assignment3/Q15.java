package poojaRDec19.Assignment3;
/*
 * 15) WAP to find string which has length more than 7characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
”abhishek”}
b. Output :- Krishna, aakansha, abhishek
 */
public class Q15 {
	
	void countLength(String []s)
	{
		for(int i=0;i<s.length;i++)
		{
		   if(s[i].length()>7)
		   {
			   System.out.print(s[i]+"  ");
		   }
		}
	}

	public static void main(String[] args) {
		String []s ={"krishna", "maulik", "aakash", "harsh", "aakansha","abhishek"};
		Q15 q15=new Q15();
		q15.countLength(s);
		
	}

}
