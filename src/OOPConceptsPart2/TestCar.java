package OOPConceptsPart2;

public class TestCar {

	//static polymorphism--compiletime polymorphism
	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
	System.out.println("******************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
	System.out.println("******************");
	//Top Casting
	Car c1=new BMW();// child class onject can referred by parent class reference variable-->dynamic polymorphism or run time polymorphism
		c1.start();//method overriding
		c1.stop();
		c1.refuel();
		
	//Down Casting
		BMW b1=(BMW)new Car();//classcastException
		
				}

}
