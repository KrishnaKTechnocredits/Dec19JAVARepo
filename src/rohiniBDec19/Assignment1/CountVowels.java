package rohiniBDec19.Assignment1;

/*8) You are given a String s, which comprises English alphabets, determine the count of all the
vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the
String s.*/

class CountVowels
{
	void count(String s)
	{
		int acnt=0,ecnt=0,icnt=0,ocnt=0,ucnt=0,cnt=0;
		for(int i=0;i<s.length();i++)
		{
		  char ch=s.charAt(i);
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
		  else
		  {
			cnt++;  
		  }
		}
		System.out.println("Count Of vowel a is "+acnt);
		System.out.println("Count Of vowel e is "+ecnt);
		System.out.println("Count Of vowel i is "+icnt);
		System.out.println("Count Of vowel o is "+ocnt);
		System.out.println("Count Of vowel u is "+ucnt);
		System.out.println("Count Of consonants is "+cnt);
	}
	
	public static void main(String[] args)
	{
		CountVowels cnt =new CountVowels();
		cnt.count("ROhiNI");
	}
	
}