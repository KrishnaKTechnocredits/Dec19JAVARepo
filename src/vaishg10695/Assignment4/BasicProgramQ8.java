package vaishg10695.Assignment4;

public class BasicProgramQ8 {
	
	void swap(int a,int b)
	{
		int temp=0;
		temp=a;
		a=b;
		b=temp;
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
