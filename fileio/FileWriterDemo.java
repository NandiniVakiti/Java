package fileio;
import java.io.FileWriter;
import java.io.Writer;
public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter w = new FileWriter("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
			w.write("welcome to java");
			w.close();
			System.out.println("Hello world");
			}
			catch (Exception e) {
				System.out.println(e);
			}
				System.out.println("Done");
	   }
  }
