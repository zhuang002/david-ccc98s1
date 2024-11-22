import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		
		sc.nextLine();
		
		for (int i=0;i<lines;i++) {
			String line = sc.nextLine();
			
			line = line.replaceAll("\\b\\w{4}\\b", "****");
			
			System.out.println(line);
			
		}
	}

	
}
