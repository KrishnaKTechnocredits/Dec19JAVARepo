public class ArraySum
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

public static void main(String[] args)
{
int arr[]={20,10,40,30};
ArraySum arraySum=new ArraySum();
arraySum.sum(arr);

}

}
