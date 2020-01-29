package ankitaPDec19.inherit_poly_abstract_2;

public class Batsman extends Cricket {
	int noofruns;
	int noofwickets;
	
	Batsman(int r, int w)
	{
		super("Sachin");
		this.noofruns = r;
		this.noofwickets = w;
	}
	
	void display()
	{
		System.out.println("Class Batsman: " + "The no of runs is "+noofruns + "The no of wickets is "+noofwickets);
	}
	
	

}
