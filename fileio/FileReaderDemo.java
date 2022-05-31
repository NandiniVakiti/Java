package fileio;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
			int b = r.read();
			while(b !=-1) {
				System.out.print((char)b);
				b=r.read();
			}
			r.close();
		}
			catch(Exception ex) {
				System.out.print(ex);
			}
		}

	}


