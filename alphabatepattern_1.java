package patternpractice;

public class alphabatepattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		int end=1;
		char ch='A';
		for(int i=1;i<=6;i++) {
			ch='A';
			ch=(char)(ch+i-1);
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch);
				ch--;
			}
			
		
		System.out.println();
		end++;
		}
		
	}

}
