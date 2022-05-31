package lab1;
import java.util.Scanner;
public class Natural {

	public static void main(String[] args) {
		
	     Scanner m = new Scanner(System.in);
	     System.out.println("Input is : ");
	     int n =m.nextInt();
	      int x = 3;
		  int y = 5;
		  int sum=0;
		  for(int i =0;i<=n;i++) {
			 
			  if (i%x==0 || i%y==0) {
				  sum = sum + i;
		
			  }
			  
		  }
		  System.out.println(sum);
	}

}
