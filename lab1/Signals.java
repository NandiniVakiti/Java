package lab1;
import java.util.Scanner;
public class Signals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Red\n2. yellow\n3. Green");
		int color = sc.nextInt();
		String message = " ";
		switch(color) {
		case 1: 
			message = "Stop";
			break;
		case 2: 
			message = "Ready";
			break;
		case 3:
			message = "Go";
			break;
		default:
			message = "Invalid Input";
			break;
		}
	
		System.out.println(message);
				
		}
}
