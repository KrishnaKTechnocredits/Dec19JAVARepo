/*Learnt:
1. void add(object obj) method
2.int size() method
3. Object get (int index)*/


package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Maulik");
		al.add(1);
		al.add(true);
		al.add(75.20);
		
		System.out.println("Total elements are "+al.size());
		for (int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		//String name = al.get(0);//This will not work as get returns object and string is child of object
		String name = (String) al.get(0);//agar narrow down karna hai to type-casting karni hi padegi.
		System.out.println(name);
		System.out.println(al);//This will not print memory address but contents as toString mthodmust have been overridden.
	}
}
