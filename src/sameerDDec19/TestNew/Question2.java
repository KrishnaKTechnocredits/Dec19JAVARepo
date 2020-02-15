package sameerDDec19.TestNew;

import java.util.ArrayList;

public class Question2
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Techno");
		al.add("Pune");
		//System.out.println(al);
		
		al.add(1, "Credits");
		System.out.println(al);
		
		display(al);
	}
	static void display(ArrayList<String> al)
	{
		for(int i=0;i<al.size();i++)
		{
			String s= al.get(i);
			System.out.print(s);
		}	
	}
}
