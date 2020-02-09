/* copy banayi par object nahi banaya to kya print karega */


package shitalSDec19.collectionsdemo_8thFeb2020;

import java.util.ArrayList;

public class ArrayListEx12 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Harsh");
		al1.add("Krishna");
		
		ArrayList<String> al2 = al1;
		
		al1.clear();
		System.out.println(al1);
		System.out.println(al2);
		
		
	}
}

