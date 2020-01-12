package anjaliSDec19.Test11jan2020;

public class SumOfPrimeNumbers {
	void sumOfPrimeNumber(String[] str)
	{
		int sum=0;
		for(int i=0;i<str.length;i++)
		{
			int n=Integer.parseInt(str[i]);
			int m=n/2;
			boolean flag = true;
			for(int j=2; j<m;j++)
			{
				if(n%j == 0)
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				sum =sum+n;
			}
		}
		System.out.println(sum);		
	}
		
	
	public static void main(String[] args) {
		SumOfPrimeNumbers s= new SumOfPrimeNumbers();
		s.sumOfPrimeNumber(args);
	} 
}
