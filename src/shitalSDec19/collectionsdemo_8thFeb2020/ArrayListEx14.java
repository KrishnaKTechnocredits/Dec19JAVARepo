/*WAP to get output as {1,9,3,7,4,2,11,17}
 * where first input is al1 ={1,9,3,7,4,2}
 * and second input is al2 ={9,11,4,3,1,17}*/

package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx14 {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(9);
		al1.add(3);
		al1.add(7);
		al1.add(4);
		al1.add(2);

		ArrayList<Integer> al2 = new ArrayList<Integer>();

		al2.add(9);
		al2.add(11);
		al2.add(4);
		al2.add(3);
		al2.add(1);
		al2.add(17);
		al1.removeAll(al2);
		al1.addAll(al2);
		System.out.println(al1);

	}

}
