package prajvalShinde.assign1T07;

public class question2 
{
	void sumArray(int[] num)
	{    
	    int totalSum=0;
		for(int i=0; i<num.length;i++)
	{
		totalSum=totalSum+num[i];
	}
	System.out.println("Sum of all elements of an array of size 4 is equals to : " + totalSum);//print value as 100
	}
	public static void main(String[] a)
	{
	question2 as1=new question2 ();
	int[] num= new int[4];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	as1.sumArray(num);
	}

}
