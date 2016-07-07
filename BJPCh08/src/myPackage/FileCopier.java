package myPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopier {
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("groceries.txt");
			out = new FileOutputStream("groceries (copy).txt"); // overwrites content
			//out = new FileOutputStream("groceries (copy).txt", true); // appends content
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
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
