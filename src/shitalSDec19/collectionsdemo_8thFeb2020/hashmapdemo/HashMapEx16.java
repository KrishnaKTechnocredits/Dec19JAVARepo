/*Find frequency of words in String = "Hi Hello Hi Globant Hi Globant Hi" with complexities*/

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx16 {
	static void wordFreqCount(String message) {
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		String[] input = message.split(" ");
		for (String word : input) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else
				wordCount.put(word, 1);
		}
		System.out.println(wordCount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input");
		String message = sc.nextLine();
		HashMap<String, Integer> answer = new HashMapEx16().wordFreqCount(message);

		Set<String> keys = answer.keySet();

		for (String currentKeys : keys) {

			System.out.println(currentKeys + ":" + answer.get(currentKeys));
		}
		// System.out.println(h);

	}

}
