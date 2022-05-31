package lab1;

import java.util.Scanner;

public class Fib2 {
	
		public static int fib(int n) {
		
		// base case
		if(n<=1)
		return n;
		//recursive case
		else
			return fib(n-1) + fib(n-2);
	}
	   public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
			int i,a=1,b=1,c=0,m;
			System.out.println("Entere of m:");
			m=input.nextInt(); // int m = 8;
		  if (m<=0) 
			  System.out.println("Fibonacci number is not defined");
			  else 
				  System.out.println(fib(m));

	}

}
