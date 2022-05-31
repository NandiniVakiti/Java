package fileio;
import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:\\Users\\NV11\\Desktop\\FileOI\\File.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		// write a single character
		bw.write('P');
		//ADD NEW LINE
		bw.newLine();
		//write array of charecters
		 char[] ch = {'A','N','S'};
		 bw.write(ch);
		 //new line
		 bw.newLine();
		 //write a string
		 bw.write("Hello capgemini");
		 bw.flush();
		 bw.close();
	}

}
