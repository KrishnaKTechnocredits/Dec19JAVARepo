/*Find Frequency of Krishna and remove Krishna from EveryWhere(ArrayList)
 * There are 3 ways: 
 * 1. For Loop
 * 2. While Loop
 * 3. Perfect While Loop  */

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx8 {
	static int count=0;
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Krishna");
		names.add("Dipa");
		names.add("Krishna");
		names.add("Aparna");
		names.add("Kranti");
		names.add("Krishna");
		names.add("Techno");
		names.add("Harsh");
		names.add("Krishna");
		
		/*for (int i =0; i<names.size(); i++)
		{
			if((names.get(i).equals("Krishna"))) {
						count++;
				names.remove("Krishna");
				}
		}
		
		System.out.println(count);
		System.out.println(names);*/
		
		
		/*names.remove("Krishna");
		names.remove(names.lastIndexOf("Krishna"));
		names.remove(names.indexOf("Krishna"));
		names.remove("Krishna");
		System.out.println(names);*/
		
		
	/*while ((names.indexOf("Krishna") != names.lastIndexOf("Krishna")))
			{
				count++;
				names.remove("Krishna");
			}
	if (names.contains("Krishna"))
	{
		count++;
		names.remove("Krishna");
	}
	System.out.println(count);
	System.out.println(names);*/
		
	while(names.contains("Krishna"))
		{
			count++;
			names.remove("Krishna");
		}
		System.out.println(count);
		System.out.println(names);
}
}


