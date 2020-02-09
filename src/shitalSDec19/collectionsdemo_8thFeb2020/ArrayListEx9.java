/*Find Frequency of Krishna and remove Krishna from EveryWhere(ArrayList)
 * Finding fault in for loop when names are back to back, hence while is printing perfect code
  & writing code using indexOf and lastIndexOf*/

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx9 {
	static int count=0;
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Krishna");//0th index
		names.add("Dipa");//1st index
		names.add("Krishna");//2nd index me ye remove ho jayega
		names.add("Krishna");//ab ye 2nd index hua par index count to Plus plus ho chuka hai isliye ye probability miss ho gayi
		names.add("Aparna");
		names.add("Kranti");
		names.add("Techno");
		names.add("Harsh");
		names.add("Krishna");
		
		for (int i =0; i<names.size(); i++)
		{
			if((names.get(i).equals("Krishna"))) {
						count++;
				names.remove("Krishna");
				}
		}
		
		System.out.println(count);
		System.out.println(names);
		
		
		
		
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
		
		/*while(names.indexOf("Krishna")!= -1)
		{
			count++;
			names.remove("Krishna");
		}
		System.out.println(count);
		System.out.println(names);
		
		while(names.lastIndexOf("Krishna")!= -1)
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


