package tt;

import java.util.Scanner;



public class a {
	
	public void tableprint(int n)
	{
		
	System.out.println("Table is = ");
     for(int i=1; i<=10; i++)
     {
    	 int t=n*i;
    	 System.out.println("" +t);
     }
	}

	
	public static void main(String[] args){
		System.out.println("hello");
		a obj=new a();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n=s.nextInt();
		obj.tableprint(n);
	}

}
