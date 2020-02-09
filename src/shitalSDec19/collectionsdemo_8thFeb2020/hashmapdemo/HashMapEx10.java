/*Find frequency of letters in word "Technocredits"
outupt {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}*/

package shitalSDec19.collectionsdemo_8thFeb2020.hashmapdemo;

import java.util.HashMap;

public class HashMapEx10 {
	public static void main(String[] args) {
		String s = "technocredits";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++)
		{
			char ch= s.charAt(i);
			if (hm.containsKey(ch))
			{
				int count = hm.get(ch)+1;
				hm.put(ch, count);
			}
			else
				hm.put(ch, 1);
		}
		System.out.println(hm);
		
	}

}
