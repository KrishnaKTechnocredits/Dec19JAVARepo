package shitalSDec19.exp1;

import shitalSDec19.assignment2.exp2.Class1;

public class Class2 extends Class1 {
	Class2()
	{ 	super();//constructor me se super call karenge to values aayengi. agar nahi kar paate to extend b allow nahi karta.
		System.out.println("Shital");

	}
	
	void m1()
	
	{
		
		
	}
	public static void main(String[] args) {
		Class2 class2 = new Class2();
		//Class1 class1 = new Class1();//q k ye protected ha t visibility nahi dega
		
	}

}
