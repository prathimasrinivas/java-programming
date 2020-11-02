package java_programs.pattern_programs;

public class Pattern4 {

	public static void main(String[] args) {
		int lines=11;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<lines;j++) {
				if(i==j||i+j==lines-1||i==5||j==5) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
