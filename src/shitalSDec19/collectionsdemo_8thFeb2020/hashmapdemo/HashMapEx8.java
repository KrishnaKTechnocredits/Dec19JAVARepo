//replace (key, oldvalue, newvalue)

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx8 {
	
public static void main(String[] args) {
	

	HashMap<Integer, String> student = new HashMap<Integer, String>();
	student.put(1, "Shital");
	student.put(4, "Ankita");
	student.put(3, "Aparna");
	student.put(2, "Sonal");
	student.put(2, "Teams");
	student.put(34, "Teams1");
	student.put(14, "Harsh");
	System.out.println(student.replace(2, "Teams", "Shital Seware"));//if hashmap is empty then it will return true else false
	//student.clear();//simple remove method works on key
	System.out.println(student);
	System.out.println(student.size());
	System.out.println(student.isEmpty());
}
	}
	

