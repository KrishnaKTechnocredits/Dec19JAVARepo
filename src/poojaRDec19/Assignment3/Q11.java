package poojaRDec19.Assignment3;

/*
 * 11) WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
reverse of actual number :- 12321
 */
public class Q11 {
int n,rev;
	void palindrome(int a)
	{int original=a;
		while(a!=0)
		{
			n=a%10;
			rev=rev*10+n;
			a=a/10;
		}
		if(original==rev)
		{
			System.out.println("no is palindrom");
		}
		else
		{
			System.out.println("no is not palindrom");
		}
	}
	public static void main(String[] args) {
		Q11 q11=new Q11();
		int a=12321;
		q11.palindrome(a);
	}

}
