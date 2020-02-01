import java.util.Scanner; 
public class VowelCount{

	void totalVowelCount(String s)
	{
		char[] ch=s.toCharArray();
		int count=0;
		
		for(int i=0; i<=ch.length-1; i++)
		{
			if(ch[i]=='a')
			{
				count++;
			}
			else if(ch[i]=='e')
			{
				count++;
			}
			else if(ch[i]=='i')
			{
				count++;
			}
			else if(ch[i]=='o')
			{
				count++;
			}
			else if(ch[i]=='u')
			{
				count++;
			}
		
		}
	
		System.out.println("Total count of vowels are:"+count);
	
	
	}

	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);  
		System.out.println("Enter string: ");
		String s=scanner.nextLine();
		VowelCount vowelCount=new VowelCount();
		vowelCount.totalVowelCount(s);
		
	
	
	}

}