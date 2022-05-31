package fileio;
import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		// create a object of BufferedReader file 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//input from users
			System.out.println("Enter first number :");
			int x = Integer.parseInt(br.readLine());
			System.out.println();
			System.out.println("Enter second number :");
			int y = Integer.parseInt(br.readLine());
			// adding both input numbers
			System.out.println("Sum is:" + (x+y));
	}

}
