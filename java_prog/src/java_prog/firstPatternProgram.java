package java_prog;

import java.util.Scanner;

public class firstPatternProgram {

	public static void main(String[] args) 
	{
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the value");
	
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n; j++)
		{
			System.out.print("* ");
		}
		 
		System.out.println();
		
	}
	
	
	
		sc.close();

	}

}
