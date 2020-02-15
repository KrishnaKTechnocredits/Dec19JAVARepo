package prasadSDec2019Test;

import java.util.ArrayList;

public class Program4 {
	
	
	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>();
		list.add("techno");
		list.add("credits");
		list.add("pune");
		System.out.println("Input:");
		System.out.println(list);
		//System.out.println(list.toArray());
		String list1[]=new String[list.size()];
		list1=(String[]) list.toArray();
		for(String i:list1) {
			System.out.println(i);
		}
	}
}
