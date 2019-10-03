package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("aravind");
		obj.sum(1, 1);
	}
	//we can overload main method also
	//method overloading--when the same method name with different arguments or input parameters within the same class 
	public void sum()//0 parameters
	{
		System.out.println("sum method");
	}
	
	public void sum(int a)//one parameter
	{
		System.out.println("sum method--1 parameter");
		System.out.println(a);
	}
	public void sum(String a)//one parameter with different data type
	{
		System.out.println("sum method--1 parameter with different data type");
		System.out.println(a);
	}
	public void sum(int a, int b)//two parameter
	{
		System.out.println("sum methhod with 2 parameter");
		System.out.println(a+b);
	}
}
