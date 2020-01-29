import java.util.Scanner;

/**
 * 
 */

/**
 * @author allister
 *
 */
public class ScannerAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter numbers to add separated by spaces followed by a non-number:");
		Scanner scan = new Scanner(System.in);
		double total = 0;
		while (scan.hasNextDouble()) {
			total += scan.nextDouble();
		}
		System.out.println(total);
		scan.close();
	}

}
