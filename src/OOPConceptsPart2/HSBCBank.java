package OOPConceptsPart2;

public class HSBCBank implements USBank,UKBank{
	//if a class is implementing any interface , then its mandatory to define/override all the methods of interface
	//overriding USBank methods
	@Override
	public void credit() {
		
		System.out.println("HSBC---Credit");
	}

	@Override
	public void debit() {
		
		System.out.println("HSBC---Debit");
	}

	@Override
	public void transfermoney() {
	
		System.out.println("HSBC---transfermoney");
	}

	//separate method
	public void CarLoan()
	{
		System.out.println("Car----->Loan");
	}
	
	public void sendmoney()
	{
		System.out.println("UKBANK----sendmoney");
	}
	
	
	
}
