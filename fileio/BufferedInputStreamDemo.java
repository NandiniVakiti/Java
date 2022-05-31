package fileio;

import java.io.*;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
		} catch (Exception e3) {
			System.out.println(e3);
		}
	}

}
