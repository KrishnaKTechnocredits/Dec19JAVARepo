//Key & value working with put method

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Shital");
		student.put(2, "Ankita");
		student.put(3, "Aparna");
		student.put(4, "Aparna");
		student.put(5, "Aparna");
		
		System.out.println(student);
		System.out.println(student.size());
		System.out.println(student.put(6, "abc"));
		System.out.println(student);
		System.out.println(student.size());
	}

}
