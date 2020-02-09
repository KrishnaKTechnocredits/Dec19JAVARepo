/*Find frequency of words in String = "Hi Hello Hi Globant Hi Globant Hi"*/

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx15 {
	public static void main(String[] args) {
		String s = "Hi Hello Hi Globant Hi Globant Hi";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String input[] = s.split(" ");
		for (String word : input) {

			if (hm.containsKey(word)) {
				int count = hm.get(word) + 1;
				hm.put(word, count);
			} else
				hm.put(word, 1);
		}
		System.out.println(hm);

	}

}
