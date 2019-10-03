package JavaBase;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+ is a concatenation sign
		//println--is used to print on the console with a new line
		//print--is used to print on the console
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);//integer first string second
		System.out.println(x+y+a+b);//String first int next=HelloWorld100200
		System.out.println(x+y+(a+b));//HelloWorld300
		System.out.println(a+b+x+y+a+x+b+y);//300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b);//300HelloWorld100200
		System.out.println("the value of a is: "+a);
		System.out.println("the addition of a and b is "+(a+b));
		System.out.print("hello world");
		System.out.println("aravind");
		
		
	}

}
