
class A {
	public void hello()
	{
		System.out.println("hello");
	
	}
	
}

class B {
	public void hi()
	{
		System.out.println("hi");
	}
	
}


public class IntegersBetween {
	void listIntegers(int start, int end)
	{
		for (int i=start; i<=end; i++)
			{
				System.out.println(i);
			}
	}
	
	public static void main(String args[])
			{
				new A().hello();
				new B().hi();
				new IntegersBetween().listIntegers(5,10);
			}
}