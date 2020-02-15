package sameerDDec19.TestNew;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question3
{
	public static void main(String[] args)
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("techno");
		al.add("credits");
		al.add("pune");
		String input="";
		//System.out.println(al.size());
		System.out.print("{");
		for(int i=0;i<al.size();i++)
		{
			input=input + (al.get(i)+", ");
		}
		input = input.trim();
		
		input.lastIndexOf(",");
		input = input.substring(0, input.lastIndexOf(","));
		
		System.out.print(input);
		System.out.println("}");
	}
	
}
