package lab1;
import java.util.*;
public class SumDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter a number");
		 int number= sc.nextInt();
		 int sum=0;

		while(number!=0)
		{
		int digit= number%10;
		sum=sum+digit*digit*digit;
		number=number/10;
		}
		System.out.println("The sum of cubes of digits of the given number is " +sum);

	}

}
