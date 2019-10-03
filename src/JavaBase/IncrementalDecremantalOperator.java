package JavaBase;

public class IncrementalDecremantalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=a++;//PostIncrement
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=1;
		int d=++c;//PreIncrement
		System.out.println(c);//2
		System.out.println(d);//2
		
		int e=3;
		int f=e--;//PostDecremental
		System.out.println(e);//2
		System.out.println(f);//3
		
		int g=5;
		int h=--g;
		System.out.println(g);//4
		System.out.println(h);//4
		
		
	}

}
