import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		
		sc.nextLine();
		
		for (int i=0;i<lines;i++) {
			String line = sc.nextLine();
			line = replaceWithStar(line);
			System.out.println(line);
		}
	}

	private static String replaceWithStar(String line) {
	
		String[] words = line.split(" ");
		
		for (int i=0;i<words.length;i++) {
			String word = words[i];
			if (word.length()==4) {
				words[i] = "****";
			}
		}
		
		String rtLine = "";
		for (String word:words) {
			rtLine+=word+" ";
		}
		return rtLine.trim();
	}

}
