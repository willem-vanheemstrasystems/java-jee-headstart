package myPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopierWithBufferedStreams {
	public static void main(String[] args) {
		// try-with-resources
		try (
			BufferedReader in = new BufferedReader(
					new FileReader("groceries.txt")
				);
			BufferedWriter out = new BufferedWriter(
					new FileWriter("groceries (copy).txt")
				);
			){
			String line;
			// As long as we don't get null we haven't reached the end of the file
			while ((line = in.readLine()) != null) {
				// As the new line will be stripped from the line, 
				// we need to append a line separator
				out.write(line + System.lineSeparator());
				System.out.println(line);
			}
		} catch(IOException ioe) { 
			ioe.printStackTrace(); 
		}
	}
}
