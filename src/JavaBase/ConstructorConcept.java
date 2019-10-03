package JavaBase;

public class ConstructorConcept {
	
	//Constructor is called when the object is created
	//hidden default constructor is always there
	
	public ConstructorConcept() {
		
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorConcept(int i) {
		System.out.println("one parameter");
	}
	
	public ConstructorConcept(int j, int k) {
		System.out.println("two parameter");
	}
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2= new ConstructorConcept(10,20);
		
			
		

	}

}
