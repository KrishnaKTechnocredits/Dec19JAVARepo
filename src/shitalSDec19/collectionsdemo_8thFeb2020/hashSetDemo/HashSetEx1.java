/* How does HashSet works? */

package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("Poonam");
		hs.add("Sameer");
		hs.add("Sairaaj");
		hs.add("Poonam");

		System.out.println(hs);
		System.out.println(hs.size());

	}

}
