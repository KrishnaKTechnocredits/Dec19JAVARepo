/*Print names whose character contains'a'  */

package shitalSDec19.collectionsdemo_8thFeb2020.hashSetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEx5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("9");
		al.add("3");
		al.add("3");
		al.add("3");

		HashSet<String> hs = new HashSet<String>(al);
		System.out.println(hs);
	}
}
