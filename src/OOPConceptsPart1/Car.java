package OOPConceptsPart1;

public class Car {
	
	int model;
	int wheel;

	public static void main (String[] args)
	{
		//new Car() is the object of the Car class
		//new keyword is used to create object
		Car a=new Car();//new car-->object and a--->object reference variable//has given copy to the objects
		Car b=new Car();
		Car c=new Car();
		
		a.model=2011;
		a.wheel=2;
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		b.model=2012;
		b.wheel=3;
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		c.model=2013;;
		c.wheel=4;
		
		System.out.println(c.model);
		System.out.println(c.wheel);
	}
}

