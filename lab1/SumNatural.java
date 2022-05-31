package lab1;
import java.util.Scanner;
public class SumNatural {

		       private int s=0;
		       public int calculateSum(int n)
		       {
		              for(int i=0;i<=n;i++)
		              {
		                     if(i%3==0||i%5==0)
		                     {
		                           s+=i;
		                     }
		              }
		              return s;
		       }
		       public static void main(String[] ar)
		       {
		             SumNatural p1 = new SumNatural();
		              Scanner s = new Scanner(System.in);
		              System.out.println("Enter Input: ");
		              int n=s.nextInt();
		              System.out.println(p1.calculateSum(n));
		       }

	}


