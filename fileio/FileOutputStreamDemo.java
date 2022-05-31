package fileio;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try 
		{
			FileOutputStream fout = new FileOutputStream("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
			String s = " welcome to Capgemini";
			byte b[] = s.getBytes();//converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Join");
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	}

}
