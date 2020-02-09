//clear() method working

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx5 {
	public static void main(String[] args) {
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Shital");
		student.put(4, "Ankita");
		student.put(3, "Aparna");
		student.put(2, "Sonal");
		student.put(2, "Teams");
		student.put(34, "Teams1");
		student.put(14, "Harsh");
		
		student.clear();//simple remove method works on key
		System.out.println(student);
		/*System.out.println(student.remove(2,"maulik"));//will return false if value is not present
		System.out.println(student.remove(14,"Harsh"));//will return true when value exists and it will remove
		System.out.println(student.remove("Ankita"));//it will return null as hashmap doesn't understand direct values without key
		System.out.println(student);
		System.out.println(student.size());*/
		
	}

}
