package pattern;

public class alphabetepattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int end=1;
		for(int i=1;i<=6;i++) {
			int cnt=6;
			
			for(int j=1;j<=end;j++) {
				System.out.print((char)(cnt+64));
				cnt--;
				
			}
			System.out.println();
			end++;
			
			
		}
	}

}
