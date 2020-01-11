package rohiniBDec19.GitTest1;

public class FindingSubString {
	
	String findubString(String s)
	{
		return s;
    }
	
	public static void main(String[] args)
	{
		FindingSubString s1 = new FindingSubString();
		String name="Hi Hello Trchnocredits Good";
		String substring=s1.findubString(name.substring(15));//using substring including index
		System.out.println("Substring is: "+substring);
		String substring1=s1.findubString(name.substring(4,20)); //using substring including and excluding index
		System.out.println("Substring is: "+substring1);
		String substring2=s1.findubString(name.substring(4,name.length())); //using substring including index and excluding with length 
		System.out.println("Substring is: "+substring2);
		String substring3=s1.findubString(name.substring(name.length())); //using substring including index with length 
		System.out.println("Substring is: "+substring3);
		
		
	}

}
