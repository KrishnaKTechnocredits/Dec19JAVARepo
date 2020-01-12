package vishwasCDec19.vishwasAssignment2;

/*
*
*Largest and smallest number in unsorted array?
*
*/

public class Q4LargestAndSmallestNO {

	
		static void maxNumber(int[] input)
		{
			int max=input[0];
			for(int i=1;i<input.length;i++)
			{
				if(input[i]<max)
				{
					max=input[i];
					//System.out.println("The smaller Number is "+input[i]);
				}
			}System. out.println("The smaller Number is "+max);		
		}
		static void minNumber(int[] input)
		{
			int min=input[0];
			for(int i=1;i<input.length;i++)
			{
				if(input[i]>min)
				{
					min=input[i];
				}
			}System.out.println("The smaller Number is "+min);		
		}
		public static void main(String[] args)
		{
			Q4LargestAndSmallestNO q4=new Q4LargestAndSmallestNO();
			int[] num=new int[4];
			int b[]={3,6,2,1,11};
			q4.maxNumber(b);
			q4.minNumber(b);
			
			
		}
	}