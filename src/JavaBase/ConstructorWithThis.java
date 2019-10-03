package JavaBase;

public class ConstructorWithThis {
	
	String name;
	int age;
	
	public ConstructorWithThis(String name, int age)
	{
		this.name=name;//to access global variable in constructor we have o use this keyword
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWithThis obj = new ConstructorWithThis("aravind",25);

	}
}