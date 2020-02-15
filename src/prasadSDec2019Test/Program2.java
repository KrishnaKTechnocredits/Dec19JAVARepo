package prasadSDec2019Test;

import java.util.ArrayList;

public class Program2 {
	
	
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Techno");
		list.add("Pune");
		System.out.println("Input:");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		System.out.println("Output:");
		list.add(1, "Credits");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}


//TechnoPune
//TechnoCreditsPune