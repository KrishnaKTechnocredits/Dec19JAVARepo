/*9) You are given a String s. Count the number of occurrences of all the digits in the Integer number. 
Input:  128896 
Output:   1 -> 1,  2 -> 1,  6 -> 1,  8 -> 2,  9 -> 1*/

package vaishg10695.Assignment1;

class charCount
{
	void count(char digit, String name)
	{
		int cnt=0;
		for(int i=0;i<name.length();i++)
		{
			if(digit==name.charAt(i))							
				cnt++;											
		}
		System.out.println("frequency of charactor "+ digit+ " is "+ cnt);
	}
 
 
  public static void main(String[] args)
  {
	charCount ch1=new charCount();
	String name= "128896";
	System.out.println("Given string is:"+name);
   
	for(int i=0;i<name.length();i++)												
	{
	   char ch=name.charAt(i);	//charAt gies charactor of secified index			
		int index=name.indexOf(ch);	//indexOf gives index of specified charactor	
		if(i==index)
			   ch1.count(ch,name);

	}			
  }
}