/**
 * 
 */

/**
 * @author ace
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	calculateMaxNumber(new int[][] {{1,2,3}, {3,4,9}, {6,8,7}});
		

	}
	
	public static int calculateMaxNumber(int[][] twoDArray) {
		int maxNum = Integer.MIN_VALUE;
		int maxX = -1;
		int maxY = -1;
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				if (twoDArray[i][j] > maxNum) {
					maxNum = twoDArray[i][j];
					maxX = i;
					maxY = j;
				}
			}
			
		}
		System.out.println("Max number: " + maxNum + " Position: (" + maxX +"," + maxY + ")");
		return maxNum;
		
	}

}
