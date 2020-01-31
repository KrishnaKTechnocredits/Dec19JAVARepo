package prasadSDec2019.Assignment3;

//WAP to find max length String from the given array. 
//a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”} 

import java.util.Arrays;

public class Question2 {
	
	static void maxLength(String s[]) {
		System.out.println("Array Elements are:"+Arrays.toString(s));
		int maxLen=0;
		String longString="";
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>maxLen) {
				maxLen=s[i].length();
				longString=s[i];
			}
		}
		System.out.println("Longest array elemet is:"+longString);
		
	}
	
	public static void main(String[] args) {
		String s[]=new String[]  {"All the best", "technocredits", "maharashtra"};
		Question2.maxLength(s);
				
	}
}
