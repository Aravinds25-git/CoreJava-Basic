package OOPConceptsPart1;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data conversion:String to Int
		String s="200";
		System.out.println(200+s);
		int i=Integer.parseInt(s);
		System.out.println(s+200);
		
		//String to double
		String s1="10.33";
		System.out.println(s1+10);
		double d=Double.parseDouble(s1);
		System.out.println(d+12.46);
		//String to boolean
		String s4="false";
		boolean b =Boolean.parseBoolean(s4);
		System.out.println(b);
		
		//Integer to String conversion
		int m=102;
		String s3=String.valueOf(m);
		System.out.println(s3+10);
		
		String u="100A";
		int n=Integer.parseInt(u);
		System.out.println(n);
	}
	

}
