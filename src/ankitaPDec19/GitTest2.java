package ankitaPDec19;

public class GitTest2 {
	static String s = "Hi Hello Technocredits Good";
	static String[] str = new String[s.length()];
	static String ss = "";
	
	static void display(String [] s)
	{  
		for (int i = 0; i<s.length; i++)
		{
			 ss = ss + s[i];
			 ss.length();
			 System.out.println("The length of "+s[i] + "is" + ss.length());
		}
	}
	public static void main(String [] args)
	{
		for (int i = 0; i<s.length(); i++)
		{
			str = s.split(" "); 
		}
		display(str);
	}
		
		
	
	
}	
		
	
	
	


	


