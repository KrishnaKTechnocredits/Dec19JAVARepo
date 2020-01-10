package surajSDec19.Test1;

public class GitTest1 {
	
	public static void split(String value)
	{
		String words[]=value.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			count++;
			
		}
		System.out.println("Total Words Count:"+count); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("");
		String value="Hi Hello Technocreditds good";
		split(value);

	}

}
