package abstarction;

public class TestAbstract extends abstractCocept {
	
	public static void main (String[] args) {
		
		abstractCocept ab=new TestAbstract ();
		ab.abc();
		ab.xyz();
		
	}

	
	public void abc() {
		System.out.println("abc---abstract");
		
	}

}
