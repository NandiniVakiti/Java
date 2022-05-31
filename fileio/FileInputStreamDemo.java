package fileio;
import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args) {
		try
		{
		FileInputStream fin = new FileInputStream("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
		int i;
		while((i=fin.read())!= -1) {
			System.out.print((char)i);
	  }
		fin.close();
	}
		catch(Exception e2) {
			System.out.println(e2);
		}
	}
}