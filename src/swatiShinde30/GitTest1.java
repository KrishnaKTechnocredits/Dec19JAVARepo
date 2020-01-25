package swatiShinde30;

public class GitTest1 {

	static void splitString(String statement) 
	{
		int count=0;
		String[] output = statement.split(" ");
		System.out.println("total words = "+output.length);
		for(int i =0; i<output.length;i++)
		{
			System.out.println(output[i]+" "+output[i].length());
		}
		
	}
	public static void main(String[] args) {
		String statement = "Hi Hello Technocredits Good";
		splitString(statement);
	}

}
