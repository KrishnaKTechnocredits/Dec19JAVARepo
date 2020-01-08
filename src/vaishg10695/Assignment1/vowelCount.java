/*8) You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. 
Print the count of all the vowels that are available in the String s. 
Approach: There are five vowels in English alphabet. Declare variables for five integers and initialize them as 0. 
Traverse the String s, character by character, check if the character is vowel(here is your thinking point how you deside that character is vovel or consonants). 
If thet character is vowel then count++ for that particular character. As of now go with ==  
Syntax for one example If(ch == ‘a’){  aCnt++; }else if(ch == ‘e’){  eCnt++; } */

package vaishg10695.Assignment1;

class vowelCount
{
	void count(String str)
	{
		int acnt=0, ecnt=0,icnt=0,ocnt=0,ucnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='A')
			{
				acnt++;
			}
			else if(ch=='e'||ch=='E')
			{
				ecnt++;
			}
			else if(ch=='i'||ch=='I')
			{
				icnt++;
			}
			else if(ch=='o'||ch=='O')
			{
				ocnt++;
			}
			else if(ch=='u'||ch=='U')
			{
				ucnt++;
			}
		}
		System.out.println("Count of vowel a is: "+ acnt);
		System.out.println("Count of vowel e is: "+ ecnt);
		System.out.println("Count of vowel i is: "+ icnt);
		System.out.println("Count of vowel o is: "+ ocnt);
		System.out.println("Count of vowel u is: "+ ucnt);

		
	}
	public static void main(String[] args)
	{
		vowelCount vc=new vowelCount();
		vc.count("vaishnavi");
	}
}