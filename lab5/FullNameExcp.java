package lab5;

import java.util.Scanner;

public class FullNameExcp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName : ");
		String firstName=sc.nextLine();
		System.out.println("Enter lastName: ");
		String lastName = sc.nextLine();
		
		try {
			if(firstName.length()==0 && lastName.length()==0)
			{
				throw new Exception("Invalid name");
			}
			else {
				System.out.println("valid name");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
