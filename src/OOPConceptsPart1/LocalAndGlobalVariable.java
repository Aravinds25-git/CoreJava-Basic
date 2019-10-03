package OOPConceptsPart1;

public class LocalAndGlobalVariable {
	//Global Variables or Class variable
	int a=15;
	String s="selenium";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		System.out.println(i);
		LocalAndGlobalVariable obj=new LocalAndGlobalVariable();
		System.out.println(obj.a);
		System.out.println(obj.s);
	}
	public void sum()
	{
		int i=15;//Local variable
		int j=20;//Local variable
		int a=15;//Local variable
	}
	
}
