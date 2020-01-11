package anjaliSDec19.Test11jan2020;

public class ReverseString {

	void reverseStr(String[] str)
	{
		for(int i =0; i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		ReverseString r1 = new ReverseString();
		//String[] arg = {"Anjali", "Shroff"};
		r1.reverseStr(args);
	}
}
