package kedarKDec19.Assignment1;

public class frequencycount {

	static void frequencycount(char letter, String name)
	{
	int count=0;
	for(int i=0;i<name.length();i++)
	{
		if(letter==name.charAt(i))
			count++;
	}
	System.out.println(letter+" "+count);
	
	}
	
	
	public static void main(String[] args)
	{
	String name="TECHNOCREDITS";
	
	int j;
    for(j=0;j<name.length();j++) {
    char ch= name.charAt(j);
    int index=name.indexOf(ch);
{
	if(j==index)
	 frequencycount(ch, name);
} 
			// TODO Auto-generated constructor stub
    }
	}
}

