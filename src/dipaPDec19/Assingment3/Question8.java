package dipaPDec19.Assingment3;
/*
 * WAP to find vowels in given string
	a. Input :- automation engineering
	b. Count :- 11
 */
public class Question8 {
	public static void main(String[] args) {
		Question8 que8 = new  Question8();
		String str = "automation engineering";
		que8.getvowelsCount(str);
		
	}

	void getvowelsCount(String str) {
		int cnt = 0;
		for(int i =0; i < str.length(); i++)
		{
			
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')//Get vowels
				cnt ++; 
		}
		System.out.println("The vowels count in given string is "+cnt);
	}
}
