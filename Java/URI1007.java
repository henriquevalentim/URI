
import java.io.IOException;
import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n, n2,n3, n4, total;

		n = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		n4 = ler.nextInt();
		total = n * n2 - n3 * n4;

		System.out.println("DIFERENCA = " + total);

	}

}