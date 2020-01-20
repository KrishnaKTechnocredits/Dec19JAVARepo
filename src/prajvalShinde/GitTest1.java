package prajvalShinde;

public class GitTest1 
{
	static String[] stringArray;
	static void dispalyCount(String name)
	{
	
       stringArray=name.split(" ");
       System.out.println(stringArray.length);
	}
	
	public static void main(String[] args)
	{
		String name ="Hi Hello Technocredits Good";
		 dispalyCount(name);
	}

}
