package vaishg10695.Assignment4;

public class BasicProgramQ9 {

	void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a and b after swap is: "+a+","+b);
	}

	public static void main(String[] args) {
		
		BasicProgramQ8 q8=new BasicProgramQ8();
		
		int a=10;
		int b=20;
		System.out.println("value of a and b before swap is: "+a+","+b);
		q8.swap(a,b);
	}

}
