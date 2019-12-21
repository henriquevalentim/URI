
import java.io.IOException;
import java.util.Scanner;

public class URI1003 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n, n2, total;

		n = ler.nextInt();
		n2 = ler.nextInt();
		total = n + n2;

		System.out.println("SOMA = " + total);

	}

}