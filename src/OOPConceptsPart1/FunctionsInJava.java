package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava obj=new FunctionsInJava();
		//after creating the object , the copy of all non static methods, will be given to this object
		obj.test();
		int l1=obj.pqr();
		System.out.println(l1);
		String s1=obj.xyz();
		System.out.println(s1);
		int i1=obj.add(100, 200);
		System.out.println(i1);
		
	}
	//non-static functions
	public void test()//return type is void//no inpu and no output
	{
		System.out.println("test method");
	}
	public int pqr()//return type is int..//no input and some output
	{
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		}
	public String xyz()//return type is String/no input and some output
	{
	System.out.println("xyz method");	
	String s="selenium";
	return s;
	}
	
	public int add(int m, int n)//input parameters/arguements
	{
		System.out.println("add method");
		int value1=m;
		int value2=n;
		int result=m+n;
		return result;
	}
	
	
}

