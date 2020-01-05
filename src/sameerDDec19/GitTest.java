package sameerDDec19;

public class GitTest 
{
	static void totalString(String statement)
	{
		String output[]=statement.split(" ");
		for(int i=0;i<output.length;i++)
		{
		//System.out.println(output.length);
		System.out.println(output[i]+ " " + output[i].length());
		}
	}
	
	
	public static void main(String[] args) 
	{
		String statement="Hi Hello Technocredits Goods";
		totalString(statement);
	}
	
	
}
