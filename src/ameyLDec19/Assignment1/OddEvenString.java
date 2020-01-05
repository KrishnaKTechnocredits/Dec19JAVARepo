/**
 * 
 */
package ameyLDec19.Assignment1;

/**
 * @author Amey
 * 
 * This program is to rearrange string in odd and even
 *
 */
public class OddEvenString {


	static void freq(String name){
		String evenS="",oddS="";
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(i%2==0)
				evenS=evenS+ch;
			else
				oddS=oddS+ch;
		}
		System.out.println("String Even -> "+evenS);
		System.out.println("String odd -> "+oddS);

	}

	public static void main(String[] args)
	{

		String name="PAUMREVYA";
		freq(name);

	}

}
