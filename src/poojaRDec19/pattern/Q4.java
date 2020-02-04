package poojaRDec19.pattern;
/*

*****
****
***
**
*

 */
public class Q4 {
    void p4()
    {
    	for(int i=1;i<=5;i++)
    	{
    		for(int j=5;j>=i;j--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    	
    }
	public static void main(String[] args) {
		Q4 q4=new Q4();
		q4.p4();

	}

}
