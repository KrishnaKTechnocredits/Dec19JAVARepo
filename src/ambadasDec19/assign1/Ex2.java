package ambadasDec19.assign1;

public class Ex2 
{
	void add()
	{
		int a[]={1,2,3,4};
		int sum=0;
		for(int i =0;i<a.length;i++)
		{
			sum +=a[i];
		}
		System.out.println("The addition of array is "+sum);
	}
	public static void main(String[] args) 
	{
		Ex2 x2=new Ex2();
		x2.add();
		
	}

}
