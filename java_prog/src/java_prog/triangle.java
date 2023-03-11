package java_prog;

import java.util.Scanner;

public class triangle {

	

		public static void main(String[] args) {
	     
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("enter a number :");
		 
		 int n = sc.nextInt();
		 
			/*
			 * for(int i=0; i<n; i++) { if(i == 0 || i == n-1) { for(int j=0; j<n; j++) {
			 * System.out.print("* ");
			 * 
			 * }
			 * 
			 * System.out.println(); }
			 * 
			 * else { for(int j=0; j<n; j++) { if( j == 0 || j == n-1) {
			 * System.out.print("* "); }
			 * 
			 * else { System.out.print("  "); } }
			 * 
			 * System.out.println(); } }
			 */
		 
		 for(int i = 0; i<=n/2; i++)
		 {
			 for(int j=0; n%2==0?j<=n:j<n; j++ )
			 {
				 if(j<=(n/2)+i && j>= (n/2)-i || i==n/2 && j==n)
				 {
					 System.out.print("* ");
				 }
				 
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

