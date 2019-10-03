package JavaBase;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//for loop---
		for(int i=10;i>=0;i--) //initialization,condition,incremental/decremental
		{
			System.out.println(i);
		}
		System.out.println("******************************");
		
	//while loop
	//disadvantage in while-- if we are not giving incremental it generate infinite loop
	int k=1;//initilaize 
	while(k<=10) {//statement
		System.out.println(k);
		k=k+1;//incremental/decremental
		
	}
	}

}
