package patternpractice;

public class bytterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 1;
		int scnt = 4;
		for (int i = 1; i <= 9; i++) {
			{
				for (int j = 1; j <= end; j++) {
					System.out.print("*");
				}
				for (int k = 1; k <= 5; k++) {
					if (k <= scnt)
						System.out.print("  ");
					else
						System.out.print("*");
				}

			}
			System.out.println();
			if (i < 5) {
				end++;
				scnt--;
			} else {
				end--;
				scnt++;
			}

		}
	}

}
