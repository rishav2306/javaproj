package java_prog;
import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          System.out.println("enter age:");
          
          int age = sc.nextInt();
          
         System.out.println("age is " + age);
         
         System.out.println("enter the name");
         
         String name = sc.next();
         
          System.out.println("the name is " + name);
          sc.close();
	}

}