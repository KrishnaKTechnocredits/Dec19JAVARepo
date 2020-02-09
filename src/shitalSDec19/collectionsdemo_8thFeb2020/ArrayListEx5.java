/*lastIndexOf() method: takes object and returns integer and returns -1 when value not found or not present.
 * it will always return last index value if values are multiple in your object*/

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx5 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shital");
		names.add("Ankita");
		names.add("Sank");
		names.add("Shital");

		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(names.size() - 1));
		
		System.out.println(names.lastIndexOf("Sontakke"));//because ye element present nahi hai
		System.out.println(names.lastIndexOf("Shital"));//0th index pe present hai but will always return 3 , always last index 
		
		System.out.println(names.lastIndexOf("Shital"));//will always return 3 , always last index 
	}

}


