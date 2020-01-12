package vaishg10695;

public class SubString 
{

	void subStr(String str)
	{
		String sub1=str.substring(3); // include index
		System.out.println(sub1);
		String s=str.substring(str.length()); //gives blank because every string has by default terminator as blank
		System.out.println(s);
		String sub=str.substring(1,9);	// start index includes index and end date exclude index
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
		SubString ss=new SubString();
		String s1="Hello vaishnavi";
		ss.subStr(s1);		
		
	}

}
