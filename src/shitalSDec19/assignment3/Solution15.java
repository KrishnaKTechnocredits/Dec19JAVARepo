/*  WAP to find string which has length more than 7characheter. 
 * a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”} 
 * b. Output :- Krishna, aakansha, abhishek  */

package shitalSDec19.assignment3;

public class Solution15 {

	static String[] output = {};
	public static void main(String[] args) {
		String [] input = {"krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek"};
		for (int i = 0; i<input.length-2; i++)
		{
			String s = input[i];
			String [] a = s.split(",");
			if (input.length > (a[i].length()));
			System.out.println(a[i]);
		}
	}
}
