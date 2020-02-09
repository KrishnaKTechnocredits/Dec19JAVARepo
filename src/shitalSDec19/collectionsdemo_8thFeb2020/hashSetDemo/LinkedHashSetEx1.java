package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("1");
		al1.add("9");
		al1.add("3");
		al1.add("3");
		al1.add("3");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(al1);
		System.out.println(lhs);
		
	}

}
