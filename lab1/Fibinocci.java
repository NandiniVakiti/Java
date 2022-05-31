package lab1;
import java.util.Scanner;
public class Fibinocci {

	public static void main(String[] args) {

         	/*Non Recursive Solution*/
						Scanner input=new Scanner(System.in);
						int i,a=1,b=1,c=0,n;
						System.out.println("Entere of n:");
						n=input.nextInt();
						System.out.print(a);
						System.out.print(" "+b);
						for(i=0;i<n-2;i++) {
							c=a+b;
							a=b;
							b=c;
							System.out.print(" "+c);
						}
						System.out.println();
						System.out.print(n+"fib of the series is: "+c);
				
			}
		
	}


