//get method working

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx3 {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Shital");
		student.put(4, "Ankita");
		student.put(3, "Aparna");
		student.put(2, "Sonal");
		student.put(2, "Teams");
		student.put(34, "Teams1");
		
		System.out.println(student.get(1));
		System.out.println(student.get("Ankita"));
		System.out.println(student);
		System.out.println(student.size());
		
	}

}
