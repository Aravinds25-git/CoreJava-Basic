package OOPConceptsPart2;

public class BMW extends Car{
	//when method name is present in parent class as well as child class with the same name and same number of arguements..
	//is called method overriding
	public void start()
	{
		System.out.println("BMW--->start");
	}
	public void theftSafety()
	{
		System.out.println("BMW---->theftSafety");
	}
	
	
}
