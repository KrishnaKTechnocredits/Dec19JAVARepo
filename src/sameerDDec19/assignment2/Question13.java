/*
* 
* WAP to reveres array
* 
*/
package sameerDDec19.assignment2;
class Question13
{
	void reveres(int[] input)
	{
		for (int i=input.length-1;i>=0;i--) 
		{  
            System.out.print(input[i]+" ");  
        }	
	}
	public static void main(String[] args)
	{
		Question13 q=new Question13();
		int [] num=new int[5];
		int b1[]={5,6,9,10,14,63};
		q.reveres(b1);
	}
}