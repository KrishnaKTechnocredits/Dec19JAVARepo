package yashashrikDec19.Assignment3;
/*6) WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet*/
public class ReverseStringQ6 {
	
	void displayReverse(String[] input)
	{
		int temp=0;
		int index=0;
		int reverse=0;
		int i=0;
		for(i=0;i<input.length;i++)
		{
			if(temp<input[i].length())
			{
				temp=input[i].length();
				index=i;
				
			}
			
				
				
		}
		System.out.println("Largest length string: "+input[index]);
		System.out.println("Reverse String is: ");
		for(int j=input[index].length()-1;j>=0;j--)
		{
			
			
			System.out.print(input[index].charAt(j));
			
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		ReverseStringQ6 q6=new ReverseStringQ6();
		String[] input= {"All the best","Technocredits","Maharashtra"};
		q6.displayReverse(input);
		
	}
}
