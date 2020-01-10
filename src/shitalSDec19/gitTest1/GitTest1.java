package shitalSDec19.gitTest1;

public class GitTest1 
{
	
	void printWords(String s1)
	{
		String [] a= s1.split(" ");			
		System.out.println("Total words in given array is " + a.length);
		for (int i =0; i<a.length; i++)
		{
			System.out.println("The letters in words " + a[i] + " are "+ a[i].length());
		}
	}
	
	public static void main(String args[]) 
	{
		String s= "Hi Hello Technocredits Good";
		GitTest1 gitTest1 = new GitTest1();
		gitTest1.printWords(s);
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			String [] input = s.split(" ");
		}
	}
}
