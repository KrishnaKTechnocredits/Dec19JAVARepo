package ambadasDec19;

public class Hello
{
		static void Display(String s)
		{
		String a[]=s.split(" ");
		System.out.println("total words in string are" + a.length);
		}
	public static void main(String[] args) 
	{
		String s= "Hi Hello TechnoCredits Good";		
		Display(s);
	
	}

}
