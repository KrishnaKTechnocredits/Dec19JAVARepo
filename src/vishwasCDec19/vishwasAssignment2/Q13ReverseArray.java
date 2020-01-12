package vishwasCDec19.vishwasAssignment2;
/*
 * WAP to reveres array
 */


public class Q13ReverseArray {

	void reveres(int[] input)
	{
		for (int i=input.length-1;i>=0;i--) 
		{  
            System.out.print(input[i]+" ");  
        }	
	}
	public static void main(String[] args)
	{
		Q13ReverseArray q=new Q13ReverseArray();
		int [] num=new int[5];
		int b1[]={5,6,9,10,14,63};
		q.reveres(b1);
	}
}