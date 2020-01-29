public class PrintPatterns {

	public static void main(String[] args) {
		printPatterns();
	}

	public static void printPatterns() {
		Integer dashCounter = 9;
		for (int i = 0; i < 4; i++) {
			dashCounter++;
			System.out.println(i + 1 + ")");
			printPattern(i, dashCounter);
			System.out.println();
			System.out.println();
		}
	}

	public static void printPattern(int patternNumber, int dashCounter) {

		switch (patternNumber) {
		case 0:
			printOne(dashCounter);
			break;
		case 1:
			printTwo(dashCounter);
			break;
		case 2:
			printThree(dashCounter);
			break;
		case 3:
			printFour(dashCounter);
			break;
		}

	}

	public static void printOne(int dashCounter) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		printDashes(dashCounter);
	}

	public static void printTwo(int dashCounter) {
		printDashes(dashCounter);
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
		}
	}

	public static void printThree(int dashCounter) {
		Integer stars = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < stars; k++) {
				System.out.print("*");
			}
			stars += 2;
			System.out.println();
		}
		printDashes(dashCounter);
	}

	public static void printFour(int dashCounter) {
		printDashes(dashCounter);
		System.out.println();
		Integer stars = 7;
		for (int i = 2; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < stars; k++) {
				System.out.print("*");
			}
			stars -= 2;
			System.out.println();
		}
	}

	public static void printDashes(int numberOfDashes) {
		for (int j = 0; j < numberOfDashes; j++) {
			System.out.print("-");
		}
	}

}
