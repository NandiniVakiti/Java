package lab1;
import java.util.*;
public class IncreasingNum {
	
		    public static void main(String[] args)
		    {
		        // Class to take input
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter a number to check - ");
		        // Taking input from user
		        int temp = scan.nextInt();
		        int num = temp;
		        // Storing the first digit
		        int digit = num%10;
		        num=num/10;
		        // Flag to store the result
		        boolean flag = true;
		        // Loop that iterates through all digits
		        while(num>0)
		        {
		            // Checking if all digits are in increasing order
		            if(digit<=num%10)
		            {
		                flag = false;
		                break;
		            }
		            digit = num%10;
		            num=num/10;
		        }
		        // printing the result
		        if(flag)
		            System.out.println(temp+" digits are in increasing order.");
		        else
		            System.out.println(temp+" digits are not in increasing order");
		    }
	
	}


