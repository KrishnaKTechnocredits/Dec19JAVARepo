package shitalSDec19.exampleson18thJan2020;

public class Swap {

	int z;
	void swapNos (int x, int y)
	{
		z = x;
		x=y;
		y=z;
		System.out.println("Swapping : " + x + "\t" + y);
	}
	public static void main(String[] args) {
		int a= 10; 
		int b=20;
		Swap swap = new Swap();
		swap.swapNos(a,b);
	}
}

