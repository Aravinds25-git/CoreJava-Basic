package JavaBase;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array is used to store similar to into a single variable
		//disadv--- array size is fixed--> to overcome this use collections
		//we cant store different data type values--> to overcome this use object array
		//single dimensional array
		//static array
		
		//int array
		int i[]=new int[4];
		 i[0]=20;
		 i[1]=30;
		 i[2]=40;
		 i[3]=50;
		 
		 System.out.println(i[0]);
		 System.out.println(i[1]);
		 System.out.println(i[2]);
		 System.out.println(i.length);
		 /////////
		 //print all the values
		 for (int j=0;j<i.length;j++)
		 {
			 System.out.println(i[j]);
		 }
		 
		 //object array
		 Object obj[]=new Object[3];
		 obj[0]='a';
		 obj[1]="aravind";
		 obj[2]=10.22;
		 System.out.println(obj[1]);
		 
	}

}
