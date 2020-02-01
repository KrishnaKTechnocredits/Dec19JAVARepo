import java.util.Scanner; 

public class ArraySum1
{
void sum(int arr[])
{
int sum=0;
    for(int i=0; i<=arr.length-1; i++)
    {
    
    sum=sum+arr[i];
    }
System.out.println("Sum of all the elements of an Array of size 4 is : "+sum);
}

int[] arrayInput()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter Length of array:");
int n=input.nextInt();
int[] arr= new int[n];

arr[0]=12;
arr[1]=1;
arr[2]=2;
arr[3]=3;
arr[6]=4; 
//System.out.print(arr);
return arr; 
}
public static void main(String[] args)
{
ArraySum1 arraySum=new ArraySum1();
//int[] arr1= arraySum.arrayInput();
// arraySum.sum(arr1);
arraySum.sum(arraySum.arrayInput());

}

}
