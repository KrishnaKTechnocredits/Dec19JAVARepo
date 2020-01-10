package dipaPDec19.GitTest1;

public class GitTest1 {

	static void totalWordCount(String str)
	{
		String [] s = null;
		for(int i = 0; i < str.length(); i++)
		{
			s = str.split(" ");
		}
		System.out.println("The total count of words are "+s.length);
		
		for(int j = 0; j < s.length; j++)
		{
			System.out.println(s[j].length());
		}
	}
	public static void main(String[] args) {
		String input = "Hi Hello Technocredits Good";
		totalWordCount(input);
		
	}

}
