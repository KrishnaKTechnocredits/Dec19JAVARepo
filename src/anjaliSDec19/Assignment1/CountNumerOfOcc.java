/*
 * You are given a string s. Count the number of occurrences of all the digits in the integer number
 */
package anjaliSDec19.Assignment1;

public class CountNumerOfOcc {
	int countOneNumber(String str, char ch)
	{
		int count=0;
		for(int i=0; i<str.length(); i++) 
					{
						if(str.charAt(i) == ch) 
							count++;
					}				
				System.out.println(ch+" -> "+count);	
		return count;
			
	}
	public static void main(String[] args) {
		
		CountNumerOfOcc cn1 = new CountNumerOfOcc();
		String str = "128896";
		char ch;
		for(int j=0; j<str.length();j++) 
		{
			
				ch = str.charAt(j);
				if (j==str.indexOf(ch)) 
				{
					cn1.countOneNumber(str, ch);
				}
		}
	}
}
		