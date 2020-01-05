package bidvevikas.Assignment1;
class PrimeNumber
{
    void checkPrime(int num)
    {
        boolean flag =true;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag =false;
                //System.out.println(num + "is not prime");
                break;
            }
        }
        if(flag == true)
            System.out.println(num + " is prime");
    }

    void findPrimeInRange(int start, int end)
    {
        for(int i=start;i<=end;i++)
        {
            checkPrime(i);    
        }
    }
    public static void main(String[] args)
    {
        PrimeNumber pNumber = new PrimeNumber();
        pNumber.findPrimeInRange(2,100);
    }
}