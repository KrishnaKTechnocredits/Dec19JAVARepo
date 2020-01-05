public class Sum{


void add(int a, int b)
{
int z=a+b;
System.out.println(z);
}

public static void main(String[] args){
        Sum sum=new Sum();
sum.add(5,20);

}

}


*******************************************************
*******************************************************
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

*******************************************************
*******************************************************
import java.util.Scanner; 

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
ArraySum arraySum=new ArraySum();
//int[] arr1= arraySum.arrayInput();
// arraySum.sum(arr1);
arraySum.sum(arraySum.arrayInput());

}

}

*****************************************************
*****************************************************
import java.util.Scanner; 
public class ArraySqSum{

void squareSum(int[] arr){
int totalSum=0;
int elementSquare=0;
for(int i=0; i<arr.length;i++){
elementSquare=arr[i]*arr[i];
totalSum=totalSum+elementSquare;
}
System.out.println("Total sum of square of elements of array: "+totalSum); 
}

public int[] arrayIntialization(){
Scanner in=new Scanner(System.in);
int n=in.nextInt(); 
int[] arr=new int[n];
arr[0]=10;
arr[1]=5;
arr[2]=2;
arr[3]=1;
return arr; 

}

public static void main(String[] args)
{
ArraySqSum arraySqSum=new ArraySqSum();
int[] arrInt=arraySqSum.arrayIntialization();
arraySqSum.squareSum(arrInt); 
}
}

**********************************************************
**********************************************************
