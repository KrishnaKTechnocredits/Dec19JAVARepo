package poonamD_ProgramsTest;

import java.util.LinkedList;

/*
 *4) WAP to Convert String into comma separated List in Java
 *   Input: String = {“techno”, “credits”, “pune”}
 *   Output: List = [techno, credits, pune]
 */
public class Q4 {
	static void convertString(String[] s)
	{
		LinkedList<String> list = new LinkedList<String>();
		for (int i=0;i<s.length;i++)
			{
				String a = s[i];
				list.add( a);
			}
		 System.out.println("the output is: "+list);
		
	}
	public static void main(String[] args)
	{
		String[] s = {"techno","credits","pune"};
		convertString(s);
	}
	

}
