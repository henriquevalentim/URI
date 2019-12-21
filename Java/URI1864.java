import java.io.IOException;
import java.util.Scanner;

public class URI1864 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int letras;
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";

		letras = in.nextInt();

		System.out.println(frase.substring(0, letras));

	}
}
