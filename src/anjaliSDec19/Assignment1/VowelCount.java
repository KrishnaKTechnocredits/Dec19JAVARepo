/*
 * Count the number of vowels in a string 
 */
package anjaliSDec19.Assignment1;

public class VowelCount {
	
	void countVowels(String str)
	{
		int a=0, e=0, i=0, o=0, u=0;
		for(int j=0;j<str.length(); j++)
		{
			if(str.charAt(j) =='a' || str.charAt(j) =='A')
				a++;
			else if(str.charAt(j) =='e' || str.charAt(j) =='E')
				e++;
			else if(str.charAt(j) =='i' || str.charAt(j) =='I')
				i++;
			else if(str.charAt(j) =='o' || str.charAt(j) =='O')
				o++;
			else if(str.charAt(j) =='u' || str.charAt(j) =='U')
				u++;
		}
		
		System.out.println("Number of vowel A in the String "+ str+ " is " +a);
		System.out.println("Number of vowel E in the String "+ str+ " is " +e);
		System.out.println("Number of vowel I in the String "+ str+ " is " +i);
		System.out.println("Number of vowel O in the String "+ str+ " is " +o);
		System.out.println("Number of vowel U in the String "+ str+ " is " +u);
	}
	
	public static void main(String[] args) {
		VowelCount vc1 = new VowelCount();
		vc1.countVowels("AnjaliAtulShroff");
	}

}
