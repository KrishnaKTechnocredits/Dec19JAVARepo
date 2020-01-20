package ankitaPDec19;

public class GitTest1 {
	static String s = "Hi Hello Technocredits Good";
	static String[] str = new String[s.length()];
	
	static void display(String s)
	{   
	for (int i = 0; i<s.length(); i++)
        {
            str = s.split(" ");
        }
	System.out.println(str.length);
      }
	
     public static void main(String [] args)
	   {
		display(s);
	   }

   }
