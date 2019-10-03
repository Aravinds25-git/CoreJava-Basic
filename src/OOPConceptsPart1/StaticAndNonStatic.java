     package OOPConceptsPart1;

public class StaticAndNonStatic {
	String name="Aravind";//non static global variable or instance variable
	static int age=23;//static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to call static methods and vars
		//1.direct calling
		sum();
		//2.calling by classname
		StaticAndNonStatic.sum();
		//var
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		//how to call Nonstatic method or var
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.sendmail();
		//obj.sum();-->not a good practice
	
	
	}
	public void sendmail()
	{
		System.out.println("sendmail");
		
	}
	public static void sum()
	{
		System.out.println("sum method");
	}
}
