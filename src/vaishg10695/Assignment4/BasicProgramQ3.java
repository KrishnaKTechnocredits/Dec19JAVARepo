package vaishg10695.Assignment4;

public class BasicProgramQ3 {
	
	
	void squre(int n)
	{
		int squre=n*n;
		System.out.println("Squre of given number is: "+squre);
	}
	
	void cube(int n)
	{
		int cube=n*n*n;
		System.out.println("Squre of given number is: "+cube);
	}

	
	public static void main(String[] args) {

		BasicProgramQ3 q3=new BasicProgramQ3();
		
		int num=10;
		System.out.println("Given number is: "+num);
		q3.squre(num);
		q3.cube(num);
	}

}
