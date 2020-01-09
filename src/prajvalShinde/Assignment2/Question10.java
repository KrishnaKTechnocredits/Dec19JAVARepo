package prajvalShinde.Assignment2;

public class Question10 { 
	void displayMaxvalue(int[] a1, int[] a2)
	{
		int i=0;
		for(i=0;i<a1.length;i++)
		{
			if(a1[i]!=a2[i])
			{
				System.out.println("values are not matching at index"+i);
				if(a1[i]>a2[i])
					System.out.println("From "+a1[i]+","+a2[i]+" max value is" +a1[i]);
				else
					System.out.println("From "+a1[i]+","+a2[i]+" max value is" +a2[i]);
			}
		}
			
	}
	public static void main(String[] args) {
		Question10 maxvalue = new Question10();
		int[] aa1 = {10,2,9,14,3};
		int[] ab2 = {10,2,18,14,13};
		maxvalue.displayMaxvalue(aa1, ab2);
		
	}
	
	
		
	}	
