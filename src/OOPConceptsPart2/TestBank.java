package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank b=new HSBCBank();//Compiletime polymorphism
		b.credit();
		b.debit();
		b.transfermoney();
		b.CarLoan();
		b.sendmoney();

		USBank u=new HSBCBank();//Child class object can be referred by parent interface reference variable (or)dynamic polymorphism
		u.credit();
		u.debit();
		u.transfermoney();
	
		
		
	
	}

}
