package java_prog;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value:");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==j || i+j==(n-1) || i==(n-1) || j==(n-1) || i+j ==(n-1)/2 || i-j == (n-1)/2 || j-i==(n-1)/2 || i+j == ((n-1)/2 + (n-1)))
				{
					System.out.print("   ");
				}
				
				else
				{
					System.out.print(" * ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++)
			{
				if(i==(n-1) || j==(n-1) || i+j <=(n-1)/2 || i-j >= (n-1)/2 || j-i>=(n-1)/2 || i+j >= ((n-1)/2 + (n-1)))
				{ 
					System.out.print("   ");
				}
				
				else
				{
					System.out.print(" * ");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
