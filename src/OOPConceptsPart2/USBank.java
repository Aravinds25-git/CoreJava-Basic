package OOPConceptsPart2;

public interface USBank {
	
	int min_amount=1000;
	
	public void credit();
	public void debit();
	public void transfermoney();
	
	// only method signature
	// no method body
	// in interface we can declare variable, and variables are static by deafault
	// vars value will not be changed , its final/constant in nature
	// static methods are allowed in JAVA1.8
	// we cannot  create the object of the interface
	// interface abstract in nature
}
