package pack4;
import java.util.Scanner;
interface Sum {
	int sum(int n);
	}

public class SumNat {
	//sum of n natural numbers
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number : ");
		 int m = sc.nextInt();
		 Sum s =(int n) -> {
			 return n*(n+1)/2;
		 };
		 System.out.println("the sum of "+m+" Natural num :");
		 System.out.println(s.sum(m));
		  
   }
}