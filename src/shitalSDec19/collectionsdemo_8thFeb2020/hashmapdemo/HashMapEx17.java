/*Find frequency of words in String = "Hi Hello Hi Globant Hi Globant Hi"*/

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx17 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "kanani");
		hm.put(2, "kanani");
		hm.put(3, "vegada");
		
		Set<Integer> keys = hm.keySet();
		
		for (Integer currentKeys : keys) {

			System.out.println(currentKeys + ":" + hm.get(currentKeys));
		}
		System.out.println(hm);

	}

}
