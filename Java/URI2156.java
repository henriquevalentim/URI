import java.util.Scanner;

public class URI2156 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase = in.nextLine();
		
		if(frase.length() <= 140) {
			System.out.println("TWEET");
		}else {
			System.out.println("MUTE");
		}
	}
}
