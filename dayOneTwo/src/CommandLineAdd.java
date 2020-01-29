/**
 * 
 */

/**
 * @author allister
 *
 */
public class CommandLineAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(addArgs(args));
}
	
	public static double addArgs(String[] args) {
		double total = 0;
		for (String arg : args) {
			try {
				total += Double.parseDouble(arg);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return total;
	}

}
