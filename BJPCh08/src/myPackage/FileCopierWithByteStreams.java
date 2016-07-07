package myPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopierWithByteStreams {
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("groceries.txt");
			out = new FileOutputStream("groceries (copy).txt"); // overwrites content
			//out = new FileOutputStream("groceries (copy).txt", true); // appends content
			// Placeholder for a read byte: c
			int c;
			// As long as we don't get -1 we haven't reached the end of the line
			while((c = in.read()) != -1) {
				// Write the read byte to the new file
				out.write(c);
				// Cast the int to a char to make it human readable
				System.out.println((char) c);
			}
		} catch(IOException ioe){
			ioe.printStackTrace();
		} finally {
			if(in != null) try { in.close(); } catch(IOException ioe) { ioe.printStackTrace(); }
			if(out != null) try { out.close(); } catch(IOException ioe) { ioe.printStackTrace(); }
		}
	}
}
