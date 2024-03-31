package pattern;

import java.util.Iterator;

public class ZeroOnePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int end = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= end; j++) {
				if (((i + j) % 2) == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}

			}
			System.out.println();
			end++;

		}

	}

}
