import java.io.IOException;
import java.util.Scanner;

public class URI2759 {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String valor1, valor2, valor3;

		valor1 = in.next();
		valor2 = in.next();
		valor3 = in.next();

		System.out.println("A = " + valor1 + ", B = " + valor2 + ", C = " + valor3);
		System.out.println("A = " + valor2 + ", B = " + valor3 + ", C = " + valor1);
		System.out.println("A = " + valor3 + ", B = " + valor1 + ", C = " + valor2);
	}
}