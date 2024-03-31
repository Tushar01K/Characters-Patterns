package patternpractice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		
for(int i=1;i<=end;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	for(int j=i;j<end;j++) {
		System.out.print("  ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
