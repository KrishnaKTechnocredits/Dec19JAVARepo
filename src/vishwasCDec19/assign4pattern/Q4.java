package vishwasCDec19.assign4pattern;
/*
 * 4)	1 2 3 4
        5 6 7
        8 9
        10
    */
import java.util.Scanner;
public class Q4 
{
	static int count=1;
	public static void main(String[] args) 
    {
		
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println(" your pattern is....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j<=rows; j++)
            {
                System.out.print(count);
                count++;
            }
             
            System.out.println();
        }
         
       
      
    }
}

