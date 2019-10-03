package JavaBase;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <> <= >= == !=
		int c=40;
		int d=50;
		if(c==d)
		{
			System.out.println("c and d are equal");
			
		}
		else {
			System.out.println("c and d are not equal");
		}

		//write a logic to find out a highest number
		int a1=100;
		int b1=200;
		int c1=300;
		//nested If else
		if (a1>b1 & a1>c1)//false and false
		{
			System.out.println("a1 is the greatest");
			
		}
		else if(b1>c1)
		{
			System.out.println("b1 is the highest");
		}
		else {
			System.out.println("c1 is the highest");
			
		}
		
	}

}
