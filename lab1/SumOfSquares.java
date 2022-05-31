package lab1;

public class SumOfSquares {
		// Java program to find the difference
		// between sum of the squares of the
		// first n natural numbers and square
		// of sum of first n natural number
		  
	 		static int squarediff(int n){
		 
	 		int l, k, m;
		    // Sum of the squares of the
		    // first n natural numbers is
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		     
		    // Sum of n naturals numbers
		    k = (n * (n + 1)) / 2;
		 
		    // Square of k
		    k = k * k;
		     
		    // Differences between l and k
		    m = Math.abs(l - k);
		     
		    return m;
		 
		}
		 
		public static void main(String s[])
		{
		    int n = 7;
		    System.out.println(squarediff(n));    
		     
		}	

	}


