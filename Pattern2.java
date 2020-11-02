package java_programs.pattern_programs;

public class Pattern2 {

	public static void main(String[] args) {
		int lines=11;
		for(int i=0;i<lines;i++) {
			for(int j=0;j<lines;j++) {
				if(j==0||j==10||i==j||i+j==lines-1) {
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

