package ambadasDec19.assign1;
class Ex6
{
	public void addition(){
		
		int first[]={10,20,30,40,50,60};
		int second[]={10,20,30,40,50,60};
		for(int i=0;i<first.length;i++)
		{
			int sum=0;
			sum= first[i]+second[i];
			System.out.println("[ "+(i+1)+" ]:=> [ " +first[i]+" ] + [ "+second[i]+" ] => "+sum);
		}
}
	
	public static void main(String arg[])
	{
		System.out.println(" This is Ex9... Addition of two array...");
		Ex6 ex6 = new Ex6();
		ex6.addition();
	}
}