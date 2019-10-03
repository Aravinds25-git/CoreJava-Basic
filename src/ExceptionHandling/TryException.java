package ExceptionHandling;

public class TryException {

	public static void main(String[] args) {
		
		//uncaught Exceptions
		//int j=10/0;
		//System.out.println(j);
		
		//CaughtException
		//Thread.sleep(2000);
		
		//1.TryCatch Block
		
		try {
			int i=10/0;
		}catch(ArithmeticException e)
		{
			e.printStackTrace();//if we want to know which type of exception
			System.out.println(e.getMessage());//give some message of the exception(/ by zero)
		}
		System.out.println("abc");
	}
	

}
