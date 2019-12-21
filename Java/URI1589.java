import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI1589 {

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		int r1, r2, cont,total;

		cont = ler.nextInt();

		for (int i = 0; i < cont; i++) {
			r1 = ler.nextInt();
			r2 = ler.nextInt();
			total = r1 + r2;
			System.out.println(total);
		}
	}
}