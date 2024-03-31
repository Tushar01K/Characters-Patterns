package pattern;

public class alphabeticpattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		for(int i=1;i<=5;i++) {
			int cnt=1;
			for(int j=1;j<=end;j++) {
				System.out.print((char)(cnt+64));
				cnt++;
			}
			System.out.println();
			end++;
		}

	}

}
