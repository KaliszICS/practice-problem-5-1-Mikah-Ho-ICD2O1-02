/**
 * Lesson: Arrays
 * Author: Mikah Ho
 * Date Created: April 28, 2026
 * Date Last Modified: April 28, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static int[] createIntArray() {

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			
			arr[i] = i + 1;
		}

		return arr;
	}

	//q2
	public static String[] createArray(String word1, String word2, String word3, String word4) {

		String[] arr = {word1, word2, word3, word4};

		return arr;
	} 

	//q3
	public static String getElement(int num, String[] arr) {

		return arr[num];
	}

	//q4
	public static void replaceElement(int num, double element, double[] arr) {

		arr[num] = element;

	}
}
