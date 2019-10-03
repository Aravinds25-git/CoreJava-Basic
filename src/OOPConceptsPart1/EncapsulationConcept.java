 package OOPConceptsPart1;

public class EncapsulationConcept {
	//data hiding
	//how to implement encapsulation
	//define all the variables as private so outside the class no one can access the variables
	//
	private int ssn;
	private String name;
	private int age;

	public static void main(String[] args) {
		
		EncapsulationConcept obj = new EncapsulationConcept();
		obj.setAge(23);
		obj.setName("Aravind");
		obj.setSsn(73497);
		
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSsn());
		 
		}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	}
