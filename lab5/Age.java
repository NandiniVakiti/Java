package lab5;
import java.util.Scanner;
public class Age {
	
	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter ur age : ");
	  int age = s.nextInt();
	  
	  try {
	   if(age < 18) 
	    throw new AgeException("Invalid age");
	   else
	    System.out.println("Valid age");
	  }
	  catch (AgeException a) {
	   System.out.println(a);
	  }
	 }
	}

