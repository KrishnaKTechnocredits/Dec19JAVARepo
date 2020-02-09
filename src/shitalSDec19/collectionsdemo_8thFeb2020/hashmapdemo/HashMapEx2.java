//key over-writing

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Shital");
		student.put(4, "Ankita");
		student.put(3, "Aparna");
		student.put(2, "Sonal");
		student.put(2, "Teams");
		
		System.out.println(student);
		System.out.println(student.size());
		
	}

}
