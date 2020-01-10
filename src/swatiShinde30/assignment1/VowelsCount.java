package swatiShinde30.assignment1;
/*
You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u].
Print the count of all the vowels that are available in the String s. 
*/
class VowelsCount
{
	static int a = 0;
	static int e = 0;
	static int icnt= 0;
	static int o = 0;
	static int u = 0;
    static int count = 0;
	int countV(String name)
	{
		for(int i=0;i<name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch== 'a')
			{
				a++;
			}else if(ch == 'e')
			{
				e++;
			}else if(ch == 'i')
			{
				icnt++;
			}else if(ch == 'o')
			{
				o++;
			}else if(ch == 'u')
			{
				u++;
			}
		}
		System.out.println("a :"+a);
		System.out.println("e :"+e);
		System.out.println("i :"+icnt);
		System.out.println("o :"+o);
		System.out.println("u :"+u);
		return count = a+e+icnt+o+u;
	}
	
	public static void main(String[] args)
	{
		VowelsCount vowelscount = new VowelsCount();
		vowelscount.countV("swatiaeiou");
		System.out.println("total vowels are"+count);
		
	}
}