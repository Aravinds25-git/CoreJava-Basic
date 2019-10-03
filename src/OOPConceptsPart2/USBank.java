package OOPConceptsPart2;

public interface USBank {
	
	int min_amount=1000;
	
	public void credit();
	public void debit();
	public void transfermoney();
	
	// only method signature
	// no method body
	// in interface we can declare variable, and variables are statis by deafault
	// vars value will not be changed , its final/constant in nature
	// no static methods in interafce
	// no main method in interface
	// we cannot  create the object of the interface
	// interface abstract in nature
}
