/* addAll() method: in short union method of maths*/


package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx10 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Harsh");
		al1.add("Krishna");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("GhanShyam");
		al2.add("Kedar");
		al2.add("Amey");
		
	//	al1.addAll(al2); // index nahi diya aur pura colection diya to hamesha last me add karega
		al1.addAll(0, al2);// kisi particular index pe add karna chahte ho to index de do, us par add kar dega
		System.out.println(al1);
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
		
	}
}
