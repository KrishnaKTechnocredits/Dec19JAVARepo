/* WAP to find reverse max length string 
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 
b. Output Max length string :- Technocredits 
c. Max length string reverse value :- stiderconhcet  */
package shitalSDec19.assignment3;

public class Solution6 {
	
	void findMaxLengthString(String [] arr)
	{ 
		String b="";
		String reverse = "";
		int maxLength=0;
		for (int i=0; i<arr.length; i++)
		{
			String s = arr[i];
			String [] a = s.split(",");
			int length = arr[i].length();
			if (maxLength <  length)
			{
				maxLength = length;
				b = arr[i];
				for (int j = b.length()-1; j>=0; j--)
					{
						reverse = reverse + b.charAt(j);
					}
			}
		System.out.println("output max length string is " + b +" and its length is " + maxLength);
		System.out.println("Max length string reverse value " + reverse);
		}
	}

	public static void main(String[] args) {
		String[] input = {"all the best", "technocredits", "", "maharashtra"};
		Solution6 solution6 = new Solution6();
		solution6.findMaxLengthString(input);
		
	}
}
