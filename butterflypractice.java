package patternpractice;

public class butterflypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 1;
		int scnt = 4;
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= end; j++) {

				System.out.print("*");
			}

			for (int j = 1; j <= 5; j++) {
				if (j <= scnt)
					System.out.print("  ");

				else if (i == 5 && j == 1)
					System.out.print("*");
				else if (j == 5 && i == 5)
					System.out.print("*");
				else
					System.out.print("*");

//	
//	   for(int j=1;j<=9;j++) {
//		if(j<=end)
//			System.out.print("*");
//		

			}
			System.out.println();
			if (i < 5) {
				scnt--;
				end++;
			} else {
				end--;
				scnt++;
			}

		}
	}

}
