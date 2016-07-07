package myPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopierWithCharacterStreams {
	public static void main(String[] args) {
		// try-with-resources
		try ( FileReader in = new FileReader("groceries.txt");
			  FileWriter out = new FileWriter("groceries (copy).txt"); // overwrites content
			  //FileWriter out = new FileWriter("groceries (copy).txt", true); // appends content	
			){
			// Placeholder for a read byte: c
			int c;
			// As long as we don't get -1 we haven't reached the end of the line
			while((c = in.read()) != -1) {
				// Write the read byte to the new file
				out.write(c);
				// Cast the int to a char to make it human readable
				System.out.print((char) c);
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
