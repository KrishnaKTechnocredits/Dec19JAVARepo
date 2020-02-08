package poonamDDec19.Assignment3;

public class Q3_CharFreqCount {
	static void findCharCount(String a,char ch) {
		int count = 0;
		for(int i=0;i<a.length();i++)
		{
			if(ch==a.charAt(i))
			{
				count++;	
			}
		}
		System.out.println("Frequrcy of character "+ch+" in given string is: "+count);
		
	}
	public static void main(String[] args) {
		String s = "electrical engineering";
		char c= 'e';
		findCharCount(s, c);
	}

}
