package praveenReddyDec2019.assignment2;

//Check if array contains a number in Java?

public class Quetion3 {
	public void ArrayContains()
	{
		int a[]  = {2,5,9,7,4,6};
		 int b = a.length;
		 boolean found = false;
		for(int i=1;i<b;i++)	{
			if(a[i]==6)	{
				found=true;
				break;
							
			}
		}
		if(found)
		   System.out.println("number present in array");
		else
			System.out.println("number not present in array");
		
	}
	
	
	public static void main(String[] args) {
		Quetion3 a1 = new Quetion3();
		a1.ArrayContains();
	}

}
