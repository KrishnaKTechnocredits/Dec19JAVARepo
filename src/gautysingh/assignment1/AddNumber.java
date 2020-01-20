package gautysingh.assignment1;
class AddNumber{
  
int SumOfNumber(int i,int j)
{    
	int sum = i+j;
    return sum;
}
     
public static void main(String[] args) 
{
         AddNumber num = new AddNumber();
         System.out.println(num.SumOfNumber(7,8));
}
}