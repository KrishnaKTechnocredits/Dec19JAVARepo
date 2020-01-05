package anjaliSDec19;


public class split {
	void Extract(String str)
	{
		String[] s1;
		s1 =str.split(" ");
		System.out.println("Total words are " + s1.length);
		for(int i=0; i<s1.length; i++)
		{
			System.out.println("String " + i + " is " +s1[i] + " and its lenght is " + s1[i].length());
		}
		
	}
	
	public static void main(String[] args) 
	{
		String str ="Anjali Atul Shroff TCS SINGLE";
		
		split s2 =new split();
		s2.Extract(str);
	}

}
