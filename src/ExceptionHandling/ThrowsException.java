package ExceptionHandling;

public class ThrowsException {
	
	//throws exception is used for method chaining
	//Throwable is a superclass.. Error and Exception are subclasses

	public static void main(String[] args) {
		
		ThrowsException t=new ThrowsException();
		/*try {
		t.div();
		}catch(Throwable e) {
			e.printStackTrace();
		}*/
		try {
		t.sum();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("abc");
		
	}
	
	public void sum()
	{
		div();
	}
		
	/*public void sum()
	{
		try {
		div();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}*/
		
	public void div() throws ArithmeticException{
		int i =10/0;//exceptionLine
		System.out.println(i);
	}

	}

