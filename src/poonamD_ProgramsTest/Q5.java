package poonamD_ProgramsTest;
/*
 * WAP to Remove all non-alphabetical characters of a String in Java
   Input: Hello, How are you?
   Output: Hello How are you
 */
public class Q5 {
	static void removeChar(String s)
	
	{
		String n ="";
		for(int i=0;i<s.length();i++)
		{
			
			char ch = s.charAt(i);
			int x= ch;
			if (x>=65 && x<=122)
			{
				n = n + ch;
			}
			
		}
		System.out.print(n + " ");
	}
			
	
	public static void main(String[] args) {
		String a = "Hello, How are you?";
		 String[] s= a.split(" ");
		
		 for(int i=0;i<s.length;i++)
		 {
			 removeChar(s[i]);
			 
		 }
		
		
	}

}
