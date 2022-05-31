package lab1;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) 
			{
				int n;
				int c;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter a number: ");
				n=s.nextInt();
				for(int i=2;i<n;i++)
				{
					c=0;
					for(int j=2;j<i;j++)
					{
						if(i%j==0)
						c=1;
					}
					if(c==0)
						System.out.println(i);
				}
			}
		

	}


