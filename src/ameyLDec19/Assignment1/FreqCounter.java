/**
 * 
 */
package ameyLDec19.Assignment1;

/**
 * @author Amey
 * 
 * This program is to calculate frequency of char in a string
 *
 */
public class FreqCounter {


	static void freq(char ch,String name)
	{
		int count=0;
		for(int i=0;i<name.length();i++){
			if(ch==name.charAt(i))
				count++;
		}
		System.out.println("Frequency of "+ ch +" in name "+ name + " is "+count);
	}


	public static void main(String[] args)
	{

		String name="AMEY";

		for(int i=0;i<name.length();i++){

			char ch=name.charAt(i);
			int index=name.indexOf(ch);
			if(i==index)
				freq(ch,name);
		}
	}
}