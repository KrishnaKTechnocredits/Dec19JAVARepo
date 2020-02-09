//Insertion order is maintained

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shital");
		names.add("Ankita");
		names.add("Sank");

		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(names.size() - 1));
		names.add(1, "February");
		System.out.println(names);
		names.set(2, "March");//set method is used to replace an object(it will replace given value on given index) 
		System.out.println(names);
		//names.set(4, "April");//no compile error but runtime pe fatega
		//System.out.println(names);// here we will get index out of bound exception as we are trying to replace value at 4th index
		//names.add(5, "April");//this will also throw error we are trying to add value to that index which is not available
		//System.out.println(names);
	}

}
