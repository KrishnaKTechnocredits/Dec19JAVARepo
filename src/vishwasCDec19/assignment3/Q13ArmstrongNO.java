package vishwasCDec19.assignment3;

public class Q13ArmstrongNO 
{
	
	
	static void printArmstrongNO(int num)
	{
	 int number, temp, total = 0;

     number = num;
     while (number != 0)
     {
         temp = number % 10;
         total = total + temp*temp*temp;
         number /= 10;
     }

     if(total == num)
         System.out.println(num + " is an Armstrong number");
     else
         System.out.println(num + " is not an Armstrong number");
     }

	
	 public static void main(String[] args) 
     {
		
		printArmstrongNO(153);
		printArmstrongNO(234);
	 }
}
