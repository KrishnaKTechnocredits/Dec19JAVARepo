/*The only option in HashSet is to use Enhanced For loop to retrieve values 
 * as get, set methods can't be used as Hashset */

package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("Poonam");
		hs.add("Sameer");
		hs.add("Sairaaj");
		hs.add("Poonam");
		
		for (String name : hs)
		{
			System.out.println(name);
		}
	}
}
