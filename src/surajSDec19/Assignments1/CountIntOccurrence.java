package surajSDec19.Assignments1;

import java.util.Scanner;
public class CountIntOccurrence{

	public void countOccurrence(String s)
	{
		char[] ch=s.toCharArray();
		int i,count=0;
		for( i=0; i<ch.length; i++)
		{
			count=0;
				for(int j=0; j<=9; j++)
				{
					if(ch[i]==j)
					{
						count++;
					}			
				}			
			//System.out.println("Count occurrence: "+ch[i]+" "+count);			
		}
		System.out.println("Count occurrence: "+ch[i]+"is"+count);
	
	}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Enter string: ");
		String s=scanner.nextLine();
		CountIntOccurrence countIntOccurrence=new CountIntOccurrence();
		countIntOccurrence.countOccurrence(s);	
	}
}