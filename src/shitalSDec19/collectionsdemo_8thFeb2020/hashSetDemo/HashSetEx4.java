/*Print names whose character contains'a'  */

package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.HashSet;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("Poonam");
		hs.add("Sameer");
		hs.add("Sairaaj");
		hs.add("Poonam");

		for (String name : hs) {
			if(name.charAt(1)=='a')
				System.out.println(name);
		}
	}
}
