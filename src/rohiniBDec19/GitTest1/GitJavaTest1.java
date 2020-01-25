package rohiniBDec19.GitTest1;

public class GitJavaTest1 {
	
	void count(String[] s)
	{
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			count++;
		}
		System.out.println("Count of substring is :"+count);
	 }
	
	public static void main(String[] args)
	{
		GitJavaTest1 git = new GitJavaTest1();
		String name="Hi Hello Trchnocredits Good";
		git.count(name.split(" "));
	}

}
