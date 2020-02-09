/*Print names whose length is greater than 7 */

package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("Poonam");
		hs.add("Sameer");
		hs.add("Sairaaj");
		hs.add("Poonam");

		for (String name : hs) {
			if (name.length() > 6)
				System.out.println(name);
		}
	}
}
