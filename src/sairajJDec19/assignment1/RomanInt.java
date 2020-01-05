package sairajJDec19.assignment1;
import java.util.Scanner;
public class RomanInt {
		static void romanToInt(String s)
		{
			int I = 1;
			int V = 5;
			int X = 10;
			int L = 50;
			int C = 100;
			int D = 500;
			int M = 1000;
			
			int ans = 0;
			boolean flag = true;
			for(int i =0; i<s.length(); i++)
			{
				char ch = s.charAt(i);
				switch(ch)
				{
				case 'I':
					ans = ans + I;
					break;
				case 'V':
					ans = ans + V;
					break;
				case 'X':
					ans = ans + X;
					break;
				case 'L':
					ans = ans + L;
					break;
				case 'C':
					ans = ans + C;
					break;
				case 'D':
					ans = ans + D;
					break;
				case 'M':
					ans = ans + M;
					break;
				default:
					flag = false;
					
				}
				if(!flag)
				{
					System.out.println("Invalid Character ->" + ch + "at index" + i  + "till the answer is" + ans);
					break;
				}
			}
			System.out.println(s + " Roman to Integer : " + ans );
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			sc.close();
			romanToInt(s);
		}
}
