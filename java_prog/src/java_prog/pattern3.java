package java_prog;

import java.util.Scanner;


public class pattern3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
       
		System.out.println("enter a value:");
		
		int n = sc.nextInt();
		 
		
		for(int i=0; i<n; i++)
		{
			for(int j =0; j<n; j++)
				
			{
				if(i==0 || i ==(n-1) || j==0 || j==(n-1) || i==1 && j>2 && j<(n-3) || i>1 && i<(n-1) && j==2 || i==(n-1)/2 && j>2 && j<(n-3) || i>1 && i< (n-1) && j == (n-3) && i != (n-1)/2  )
				{
					System.out.print("* ");
				
				}
				/*
				 * else if(i==1 && j>2 && j<(n-3) || i>1 && i<(n-1) && j==2 || i==(n-1)/2 && j>2
				 * && j<(n-3) || i>1 && i< (n-1) && j == (n-3) && i != (n-1)/2 ) {
				 * 
				 * System.out.print("* ");
				 * 
				 * }
				 */
				
				else 
				{
					System.out.print("  ");
				}
	
			}
			System.out.println();
			
			
			
		}
		sc.close();
	}

}
