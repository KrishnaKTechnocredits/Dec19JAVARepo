package vaishg10695;

public class countWord 
{
	void wordCount(String str)
	{
		  String[] cnt=str.split(" ");
	
		System.out.println("total word in given string is: "+ cnt.length); 
	}
	
	public static void main(String[] args) 
	{
		countWord cw=new countWord();
		String str="hi hello technocredits good";
		System.out.println("given string is: "+ str);
		cw.wordCount(str);
	}
	
}
