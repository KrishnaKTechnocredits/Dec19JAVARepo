package sameerDDec19.assignment1;
/*
You are given a String s, which comprises English alphabets, determine the count of all the vowels in S. Vowels are [a,e,i,o,u]. Print the count of all the vowels that are available in the String s.
*/
public class Question8
{

	void vowelsCount(String temp)
	{
		int[] count=new int[5];
	char[] ch = temp.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
	if(ch[i] == 'a')
	{
	count[0]=count[0]+1;
	
                                          
	}
	if(ch[i] == 'e')
	{
		count[1]=count[1]+1;
	}
	if(ch[i] == 'i')
	{
		count[2]=count[2]+1;
	}
	if(ch[i] == 'o')
	{
		count[3]=count[3]+1;
	}
	if(ch[i] == 'u')
	{
		count[4]=count[4]+1;
	}

}
	
	System.out.println("a is = "+count[0]);

	System.out.println("e is = "+count[1]);

	System.out.println("i is = "+count[2]);

	System.out.println("o is = "+count[3]);

	System.out.println("u is = "+count[4]);
	}
	public static void main(String[] args)
	{
		Question8 q = new Question8(); 
		String temp1="vishwas";
		q.vowelsCount(temp1);
		
		
		
}
}
			