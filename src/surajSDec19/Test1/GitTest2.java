package surajSDec19.Test1;

public class GitTest2 {

	public static void split(String value)
	{
		String words[]=value.split(" ");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]+":"+words[i].length());
		}
		System.out.println("Total Words Count:"+words.length); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("");
		String value="Hi Hello Technocreditds good";
		split(value);
	}
}
