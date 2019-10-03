package JavaBase;

public class ConstructorSuperChild extends ConstructorSuperParent {
	
	public ConstructorSuperChild ()
	{
		super(10);//used to call parent class constructor
		System.out.println("Default child");
	}
	

	public static void main(String[] args) {
		
		ConstructorSuperChild obj =new ConstructorSuperChild();
	}

}
