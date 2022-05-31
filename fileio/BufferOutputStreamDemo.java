package fileio;
import java.io.*;

public class BufferOutputStreamDemo {

	public static void main(String[] args) throws Exception {
		
			FileOutputStream fout = new FileOutputStream("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "wow.....Wonderla";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Sucess");
		
		}
	}



