package myPackage;

public class FormattingOutput {
	public static void main(String[] args) {
		/* System.out is a PrintStream,
		 * but a PrintStream class is 
		 * a specialization of an OutStream.
		 * The write() method is thus available.
		 */
		System.out.write(50); // 50 corresponds to the character '2'
		System.out.write((int) '\n'); // new line
		// However, it much easier to use print and println
		System.out.print("Text without new line");
		System.out.print("\r\nYou can enter a newline\r\n"
				+ "manually, as well as tabs using \t tab \t tab \t tab ... \r\n"
				+ "Backslashes themselves are entered with \\...\r\n");
		
		System.out.println("println is easier to show a "
				+ "string with a new line");
		
		// The format method can be used to format arguments in a string
		int number = 10;
		double othernumber = 1.134;
		System.out.println("Using + is okay in most cases: " + number 
				+ ", " + othernumber);
		
		System.out.format("But format allows for more flexibility: %d, %3.2f %n", number, othernumber);
		
		System.out.format("Another %3$s: %2$+020.10f, %1$d%n", number, othernumber, "example");
	}
}
