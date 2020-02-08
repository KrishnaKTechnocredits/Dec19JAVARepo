package ankitaPDec19.inherit_poly_abstract_2;

public class Test {
	
	public static void main(String [] args)
	{
		Baller baller = new Baller(50,6);
	    baller.display();
	    Batsman batsman = new Batsman(100,8);
	    batsman.display();
	    Cricket cricket = new Cricket("Rohit");
	    cricket.display();
	    Football football = new Football("Rahul",9);
	    football.display();
	}
	
	

}
