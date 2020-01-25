package sonalPDec19.assignment1;
/*
 * Write a program to add the corresponding elements of two arrays,each of size N and print the sums.
 * N can be any integer between 1 and 100. 
 */



class AddArrayElement
{
	void addElement(int[] input, int[] input1)
	{
		int j=0;
		for(int i=0; i<input.length; i++)
		{
			if(i == j)
			{
				int elementSum = input[i]+input1[j];
				System.out.print(elementSum +" ");
				
				if(j<input1.length-1)
				{
					j++;
				}
			}
			else
			break;
		}
	}
	
	public static void main(String[] a)
	{
		AddArrayElement addarrayelement = new AddArrayElement();
		int[] num = new int[4];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		//num[4] = 5;
		
		int[] num1 = new int[5];
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;
		addarrayelement.addElement(num, num1);
	}
}

