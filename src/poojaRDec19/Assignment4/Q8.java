package poojaRDec19.Assignment4;

//WAP to swap two numbers using the thirdvariable

public class Q8 {

	void operation(int a,int b)
	{	int c=a;
		a=b;
		b=c;
		System.out.println("value of b : "+b);
	}

	public static void main(String[] args) {
		Q8 q8=new Q8();
		q8.operation(10,20);
		
	}
}
