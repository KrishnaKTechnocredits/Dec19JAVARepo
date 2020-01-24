package rutujaGDec19.Assignment3;
/*Count of vowel*/
import java.util.Scanner;
public class Question8 {
	void countOfVowel(String a) {
		int a1=0,e=0,i1=0,o=0,u=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a')
			{
				a1=a1+1;
			}
			else if(a.charAt(i)=='e') {
				e=e+1;
			}
			else if(a.charAt(i)=='i'){
				i1=i1+1;
			}
			else if(a.charAt(i)=='o'){
				o=o+1;
			}
			else if(a.charAt(i)=='u'){
				u=u+1;
			}
		} 
		System.out.println("Count of a:"+a1);
		System.out.println("Count of e:"+e);
		System.out.println("Count of i:"+i1);
		System.out.println("Count of o:"+o);
		System.out.println("Count of u:"+u);
	}
		
	
	public static void main(String[] args)
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		a=sc.next();
	    Question8 q = new Question8();
	     q.countOfVowel(a);
	}
}

